package jn0;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B=\u00124\u0010\u0007\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\b\u0010\tRH\u0010\u0007\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Ljn0/a;", "T", "R", "", "Lkotlin/Function3;", "Ljn0/c;", "Lkotlin/coroutines/Continuation;", "block", "<init>", "(Lwn0/q;)V", "a", "Lwn0/q;", "()Lwn0/q;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.q<c<T, R>, T, Continuation<? super R>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public a(wn0.q<? super c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block) {
        p013kotlin.jvm.internal.s.k(block, "block");
        this.block = block;
    }

    public final wn0.q<c<T, R>, T, Continuation<? super R>, Object> a() {
        return this.block;
    }
}
