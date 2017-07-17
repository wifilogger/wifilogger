package io.github.wifilogger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicTest {
  @Test
  public void testGetNumber_returns42() {
    Magic magic = new Magic();

    assertEquals(42, magic.getNumber());
  }
}
