package three.stone.redis;

import java.lang.reflect.Method;

public class RedisCommand {
    private Method method;
    private Object[] args;

    public RedisCommand(Method method, Object[] args) {
        this.method = method;
        this.args = args;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArgs() {
        return args;
    }
}
