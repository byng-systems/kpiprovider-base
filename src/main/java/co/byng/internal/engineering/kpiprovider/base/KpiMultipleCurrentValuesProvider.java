/**
 * KpiMultipleValueProvider.java
 * Created 23-Dec-2015 19:10:06
 *
 * @author M.D.Ward <matthew.ward@byng.co>
 * Copyright (c) 2015, Byng Services Ltd
 */

package co.byng.internal.engineering.kpiprovider.base;

import java.util.Map;



/**
 * KpiMultipleCurrentValuesProvider
 * 
 * @author M.D.Ward <matthew.ward@byng.co>
 */
public interface KpiMultipleCurrentValuesProvider <K, V, A> extends KpiProvider {
    
    public Map<K, V> getCurrentValues(A args);
    
}
