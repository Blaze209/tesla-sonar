package net.time4j.calendar.service;

import net.time4j.engine.q;
import net.time4j.engine.u;

/* JADX INFO: loaded from: classes9.dex */
public class f<T extends q<T>> extends d<Integer, T> {
    private static final long serialVersionUID = -4975173343610190782L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f94108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient u<T> f94109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient u<T> f94110g;

    public f(String str, Class<T> cls, int i11, int i12, char c11) {
        super(str, cls, c11, str.startsWith("DAY_OF_"));
        this.f94107d = i11;
        this.f94108e = i12;
        this.f94109f = null;
        this.f94110g = null;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return Integer.valueOf(this.f94108e);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return Integer.valueOf(this.f94107d);
    }

    public f(String str, Class<T> cls, int i11, int i12, char c11, u<T> uVar, u<T> uVar2) {
        super(str, cls, c11, false);
        this.f94107d = i11;
        this.f94108e = i12;
        this.f94109f = uVar;
        this.f94110g = uVar2;
    }
}
