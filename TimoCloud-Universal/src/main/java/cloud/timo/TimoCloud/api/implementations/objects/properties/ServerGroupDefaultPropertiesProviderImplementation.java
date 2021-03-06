package cloud.timo.TimoCloud.api.implementations.objects.properties;

import cloud.timo.TimoCloud.api.objects.properties.ServerGroupProperties;
import cloud.timo.TimoCloud.common.utils.RandomIdGenerator;

import java.util.Arrays;
import java.util.Collection;

public class ServerGroupDefaultPropertiesProviderImplementation implements ServerGroupProperties.ServerGroupDefaultPropertiesProvider {

    @Override
    public Integer getOnlineAmount() {
        return 1;
    }

    @Override
    public Integer getMaxAmount() {
        return -1;
    }

    @Override
    public Integer getRam() {
        return 1024;
    }

    @Override
    public Boolean isStatic() {
        return false;
    }

    @Override
    public Integer getPriority() {
        return 1;
    }

    @Override
    public String getBaseIdentifier() {
        return null;
    }

    @Override
    public Collection<String> getSortOutStates() {
        return Arrays.asList("OFFLINE", "STARTING", "INGAME", "RESTARTING");
    }

    @Override
    public String generateId() {
        return RandomIdGenerator.generateId();
    }
}
