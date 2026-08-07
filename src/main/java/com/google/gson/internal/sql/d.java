package com.google.gson.internal.sql;

import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f45004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b<? extends Date> f45005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b<? extends Date> f45006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f45007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f45008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f45009f;

    class a extends com.google.gson.internal.bind.c.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends com.google.gson.internal.bind.c.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z11;
        try {
            Class.forName("java.sql.Date");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        f45004a = z11;
        if (z11) {
            f45005b = new a(java.sql.Date.class);
            f45006c = new b(Timestamp.class);
            f45007d = com.google.gson.internal.sql.a.f44998b;
            f45008e = com.google.gson.internal.sql.b.f45000b;
            f45009f = c.f45002b;
            return;
        }
        f45005b = null;
        f45006c = null;
        f45007d = null;
        f45008e = null;
        f45009f = null;
    }
}
