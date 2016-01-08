/**
 * CurrentValueProvider.java
 * Created 29-Sep-2015 07:48:46
 *
 * @author M.D.Ward <matthew.ward@byng.co>
 * Copyright (c) 2015, Byng Services Ltd
 */

package co.byng.internal.engineering.kpiprovider.base;



/**
 * CurrentValueProvider 
 * 
 * @author M.D.Ward <matthew.ward@byng.co>
 */
public interface KpiCurrentValueProvider <T, A> extends KpiProvider {

    public T getCurrentValue(A args);
    
}
