package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.plaid.internal.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractActivityC4540t4 extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f48139a = a.C0759a.f48141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48140b;

    /* JADX INFO: renamed from: com.plaid.internal.t4$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.plaid.internal.t4$a$a, reason: collision with other inner class name */
        public static final class C0759a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0759a f48141a = new C0759a();
        }

        /* JADX INFO: renamed from: com.plaid.internal.t4$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Intent f48142a;

            public b(Intent intent) {
                p013kotlin.jvm.internal.s.k(intent, "intent");
                this.f48142a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f48142a, ((b) obj).f48142a);
            }

            public final int hashCode() {
                return this.f48142a.hashCode();
            }

            public final String toString() {
                return "OnCreate(intent=" + this.f48142a + ")";
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.t4$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Intent f48143a;

            public c(Intent intent) {
                this.f48143a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f48143a, ((c) obj).f48143a);
            }

            public final int hashCode() {
                Intent intent = this.f48143a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            public final String toString() {
                return "OnNewIntent(intent=" + this.f48143a + ")";
            }
        }
    }

    public abstract void a(Intent intent);

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f48140b = bundle.getBoolean("outOfProcessActivityLaunched", false);
        }
        Intent intent = getIntent();
        p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
        this.f48139a = new a.b(intent);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f48139a = new a.c(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        super.onResume();
        a cVar = this.f48139a;
        if (this.f48140b) {
            this.f48140b = false;
            if (p013kotlin.jvm.internal.s.f(cVar, a.C0759a.f48141a)) {
                Intent intent = new Intent();
                intent.putExtra("link_out_of_process_closed_redirect_uri", true);
                cVar = new a.c(intent);
            } else if (cVar instanceof a.b) {
                ((a.b) cVar).f48142a.putExtra("link_out_of_process_closed_redirect_uri", true);
            }
        }
        this.f48139a = a.C0759a.f48141a;
        if (cVar instanceof a.C0759a) {
            return;
        }
        if (cVar instanceof a.b) {
            a(((a.b) cVar).f48142a);
        } else if (cVar instanceof a.c) {
            a(((a.c) cVar).f48143a);
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        p013kotlin.jvm.internal.s.k(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("outOfProcessActivityLaunched", this.f48140b);
    }
}
