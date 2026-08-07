package net.time4j.format.expert;

import net.time4j.engine.ChronoException;

/* JADX INFO: loaded from: classes9.dex */
class a extends ChronoException {
    private static final long serialVersionUID = -4315329288187364457L;

    a(net.time4j.engine.p<?> pVar) {
        super("Duplicate element parsed with different values: " + pVar.name());
    }
}
