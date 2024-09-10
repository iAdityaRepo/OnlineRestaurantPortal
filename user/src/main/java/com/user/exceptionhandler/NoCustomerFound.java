package com.user.exceptionhandler;

import com.user.util.Constant;

/**
 * Custom exception thrown when no customer is found.
 * <p>
 * This exception is used to signal that a requested customer could not be found
 * in the system. It extends {@link RuntimeException} and provides a default error message.
 * </p>
 */
public class NoCustomerFound extends RuntimeException {
  /**
   * Constructs a new {@link NoCustomerFound} exception with a default error message.
   */
  public NoCustomerFound() {
    super(Constant.NO_CUSTOMER_FOUND);
  }
}


