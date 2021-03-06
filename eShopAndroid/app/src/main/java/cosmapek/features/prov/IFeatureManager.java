package cosmapek.features.prov;

import cosmapek.interfaces.IFeatureB;
import cosmapek.interfaces.IFeaturesB;

import java.util.LinkedList;

/**
 * Created by ArchyWin on 5/25/2015.
 */
public interface IFeatureManager {

    void createAFeature(String name);

    void updateRuntimeRegistry(LinkedList<String> sol);

    LinkedList<IFeatureB> getFeaturesWith(String feature);

    boolean hasFeaturesWith(String feature);

    IFeaturesB getFeaturesInRuntime();

    void clearFeatures();
}
