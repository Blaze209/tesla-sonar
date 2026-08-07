package com.fourthline.orca.internal;

import android.content.Context;
import android.content.SharedPreferences;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3259ff {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f31739c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f31740d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f31742b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ff$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3259ff(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f31741a = context;
        this.f31742b = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.t11
            @Override // wn0.a
            public final Object invoke() {
                return C3259ff.a(this.f35520a);
            }
        });
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.f31742b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences a(C3259ff c3259ff) {
        return c3259ff.f31741a.getSharedPreferences("EtagPreference", 0);
    }

    public final String a(String filename) {
        p013kotlin.jvm.internal.s.k(filename, "filename");
        return a().getString(filename, null);
    }

    public final void a(String filename, String value) {
        p013kotlin.jvm.internal.s.k(filename, "filename");
        p013kotlin.jvm.internal.s.k(value, "value");
        a().edit().putString(filename, value).apply();
    }
}
