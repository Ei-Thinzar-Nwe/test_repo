package com.jdc.grace.dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTimeApiTest {
  
  @Test
  void testInstantToHuman() {
    Instant i1 = Instant.now();
    ZonedDateTime zdt = i1.atZone(ZoneId.of("Asia/Yangon"));
    System.out.println(zdt);
    OffsetDateTime odt = i1.atOffset(ZoneOffset.ofHours(5));
    System.out.println(odt);
  }
  
  @Test
  @Disabled
  //must have time and zone or offset
  void testDateHumanToInstant() {

    LocalDateTime date = LocalDateTime.now(); // private constructor fyk ny loh obj create loh m ya
    //Human h = Human.getInstance(); // only one object fyk ag lote tr final class n private con ka
    System.out.println(date);
    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println(zdt);
    OffsetDateTime odt = OffsetDateTime.now();
    System.out.println(odt);
    
    Instant i1 = date.toInstant(ZoneOffset.of("+06:30"));//infront of 6, 0 must be add in offset value
    System.out.println(i1);
    
    Instant i2 = zdt.toInstant();
    System.out.println(i2);
    
    Instant i3 = odt.toInstant();
    System.out.println(i3);
    
  }
}

/*
 * final class Human {
 * 
 * private static Human instance;
 * 
 * private Human() { }
 * 
 * public static Human getInstance() {
 * 
 * //lock cha htr ta khu ka pe obj create loh ya synchronized (instance) { if
 * (null == instance) { instance = new Human(); } } return instance; }
 * 
 * }
 */