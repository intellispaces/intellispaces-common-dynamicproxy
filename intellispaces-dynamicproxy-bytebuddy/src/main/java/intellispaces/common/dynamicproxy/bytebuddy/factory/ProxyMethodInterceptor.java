package intellispaces.common.dynamicproxy.bytebuddy.factory;

import intellispaces.common.dynamicproxy.contract.MethodHandler;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.This;

public class ProxyMethodInterceptor {
  private final MethodHandler handler;

  ProxyMethodInterceptor(MethodHandler handler) {
    this.handler = handler;
  }

  @RuntimeType
  public Object intercept(@This Object object, @AllArguments Object[] arguments) throws Exception {
    return handler.handle(object, arguments);
  }
}
