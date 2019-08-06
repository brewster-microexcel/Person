
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


/**
 * Fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
@RequiredArgsConstructor
public class SalesOrderTextDeleteFluentHelper
    extends FluentHelperDelete<SalesOrderTextDeleteFluentHelper, SalesOrderText>
{

    /**
     * {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity object that will be deleted in the S/4HANA system.
     * 
     */
    @NonNull
    @Getter(AccessLevel.PROTECTED)
    private final SalesOrderText entity;

}
