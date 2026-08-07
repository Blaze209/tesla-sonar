package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.play.core.integrity.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0673a {

        /* JADX INFO: renamed from: com.google.android.play.core.integrity.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0674a {
            public abstract AbstractC0673a a();

            public abstract AbstractC0674a b(long j11);
        }

        public static AbstractC0674a c() {
            y yVar = new y();
            yVar.c(0);
            return yVar;
        }

        public abstract int a();

        public abstract long b();

        abstract String d();
    }

    public static abstract class b {
        public abstract String a();
    }

    public interface c {
        Task<b> a(d dVar);
    }

    public static abstract class d {

        /* JADX INFO: renamed from: com.google.android.play.core.integrity.a$d$a, reason: collision with other inner class name */
        public static abstract class AbstractC0675a {
            public abstract d a();

            public abstract AbstractC0675a b(String str);
        }

        public static AbstractC0675a a() {
            a0 a0Var = new a0();
            a0Var.c(iu.q.h());
            return a0Var;
        }

        public abstract String b();

        public abstract Set<Integer> c();
    }

    Task<c> a(AbstractC0673a abstractC0673a);
}
