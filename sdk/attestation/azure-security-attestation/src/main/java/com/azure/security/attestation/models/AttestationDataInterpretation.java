// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for AttestationDataInterpretation. */
public final class AttestationDataInterpretation extends ExpandableStringEnum<AttestationDataInterpretation> {
    /**
     * Static value BINARY for AttestationDataInterpretation.
     * <p>
     * When the attestation service receives the Data, it should interpret the data as
     * binary, and return the data in the {@link AttestationResult#getEnclaveHeldData()} property.
     * </p>
     */
    public static final AttestationDataInterpretation BINARY = fromString("BINARY");

    /**
     * Static value JSON for AttestationDataInterpretation.
     * <p>
     * When the attestation service receives the RunTime Data, it should interpret the data as
     * binary, and return the data in the {@link AttestationResult#getRuntimeClaims()} property
     * </p>
     */
    public static final AttestationDataInterpretation JSON = fromString("JSON");

    /**
     * Creates or finds a AttestationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AttestationType.
     */
    public static AttestationDataInterpretation fromString(String name) {
        return fromString(name, AttestationDataInterpretation.class);
    }

    /** @return known AttestationType values. */
    public static Collection<AttestationDataInterpretation> values() {
        return values(AttestationDataInterpretation.class);
    }
}
