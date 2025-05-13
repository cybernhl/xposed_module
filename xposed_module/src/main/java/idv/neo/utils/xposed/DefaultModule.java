package idv.neo.utils.xposed;

public class DefaultModule implements BaseModule {
    @Override
    public void hookTarget(String applicationid,ClassLoader classLoader) {
        System.out.println("Use DefaultModule demo hooked : "+applicationid);
    }
}
