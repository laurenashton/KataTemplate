package com.elsevier.kata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

  @Test
  void sampleTests() {
    assertTrue(ValidParentheses.validParentheses("()"));
    assertFalse(ValidParentheses.validParentheses("())"));
    assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
    assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
    assertTrue(ValidParentheses.validParentheses("adasdasfa"));
  }
}
