package idv.neo.utils.xposed;

import java.util.HashMap;
import java.util.Map;

public abstract class ModuleFactory {
    private final Map<String, BaseModule> moduleMap = new HashMap<>();

    public BaseModule create(String packageName) {
        if (moduleMap.containsKey(packageName)) {
            return moduleMap.get(packageName);
        }
        BaseModule module = createModuleByPackage(packageName);
        moduleMap.put(packageName, module);
        return module;
    }
    protected abstract BaseModule createModuleByPackage(String packageName);
}
