/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.iidm.network.impl;

import eu.itesla_project.iidm.network.PhaseTapChangerStep;

/**
 *
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
class PhaseTapChangerStepImpl extends TapChangerStepImpl<PhaseTapChangerStepImpl>
                              implements PhaseTapChangerStep {

    private float alpha;

    PhaseTapChangerStepImpl(float alpha, float rho, float r, float x, float g, float b) {
        super(rho, r, x, g, b);
        this.alpha = alpha;
    }

    @Override
    public float getAlpha() {
        return alpha;
    }

    @Override
    public PhaseTapChangerStep setAlpha(float alpha) {
        this.alpha = alpha;
        return this;
    }

}
