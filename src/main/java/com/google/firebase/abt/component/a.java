package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import tu.b;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, b> f43844a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f43845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yv.b<wu.a> f43846c;

    protected a(Context context, yv.b<wu.a> bVar) {
        this.f43845b = context;
        this.f43846c = bVar;
    }

    protected b a(String str) {
        return new b(this.f43845b, this.f43846c, str);
    }

    public synchronized b b(String str) {
        try {
            if (!this.f43844a.containsKey(str)) {
                this.f43844a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43844a.get(str);
    }
}
