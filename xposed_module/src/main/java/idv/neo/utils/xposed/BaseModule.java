package idv.neo.utils.xposed;
public interface BaseModule {
    void hookTarget(String applicationid,ClassLoader classLoader);
}
