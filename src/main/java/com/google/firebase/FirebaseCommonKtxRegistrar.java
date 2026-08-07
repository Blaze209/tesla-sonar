package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import yu.a0;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lyu/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements yu.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f43837a = new a<>();

        @Override // yu.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher a(yu.d dVar) {
            Object objD = dVar.d(a0.a(xu.a.class, Executor.class));
            s.j(objD, "get(...)");
            return ExecutorsKt.from((Executor) objD);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements yu.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f43838a = new b<>();

        @Override // yu.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher a(yu.d dVar) {
            Object objD = dVar.d(a0.a(xu.c.class, Executor.class));
            s.j(objD, "get(...)");
            return ExecutorsKt.from((Executor) objD);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements yu.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f43839a = new c<>();

        @Override // yu.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher a(yu.d dVar) {
            Object objD = dVar.d(a0.a(xu.b.class, Executor.class));
            s.j(objD, "get(...)");
            return ExecutorsKt.from((Executor) objD);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements yu.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f43840a = new d<>();

        @Override // yu.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher a(yu.d dVar) {
            Object objD = dVar.d(a0.a(xu.d.class, Executor.class));
            s.j(objD, "get(...)");
            return ExecutorsKt.from((Executor) objD);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        yu.c cVarD = yu.c.e(a0.a(xu.a.class, CoroutineDispatcher.class)).b(q.l(a0.a(xu.a.class, Executor.class))).f(a.f43837a).d();
        s.j(cVarD, "build(...)");
        yu.c cVarD2 = yu.c.e(a0.a(xu.c.class, CoroutineDispatcher.class)).b(q.l(a0.a(xu.c.class, Executor.class))).f(b.f43838a).d();
        s.j(cVarD2, "build(...)");
        yu.c cVarD3 = yu.c.e(a0.a(xu.b.class, CoroutineDispatcher.class)).b(q.l(a0.a(xu.b.class, Executor.class))).f(c.f43839a).d();
        s.j(cVarD3, "build(...)");
        yu.c cVarD4 = yu.c.e(a0.a(xu.d.class, CoroutineDispatcher.class)).b(q.l(a0.a(xu.d.class, Executor.class))).f(d.f43840a).d();
        s.j(cVarD4, "build(...)");
        return v.p(cVarD, cVarD2, cVarD3, cVarD4);
    }
}
