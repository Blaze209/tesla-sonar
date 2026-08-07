package androidx.collection;

import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Landroidx/collection/y0;", "Lkotlin/collections/s0;", "a", "(Landroidx/collection/y0;)Lkotlin/collections/s0;", "", "b", "(Landroidx/collection/y0;)Ljava/util/Iterator;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a1 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/collection/a1$a", "Lkotlin/collections/s0;", "", "hasNext", "()Z", "", "nextInt", "()I", "a", "I", "getIndex", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p013kotlin.collections.s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<T> f3822b;

        a(y0<T> y0Var) {
            this.f3822b = y0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f3822b.l();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p013kotlin.collections.s0
        public int nextInt() {
            y0<T> y0Var = this.f3822b;
            int i11 = this.index;
            this.index = i11 + 1;
            return y0Var.h(i11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/collection/a1$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<T> f3824b;

        b(y0<T> y0Var) {
            this.f3824b = y0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f3824b.l();
        }

        @Override // java.util.Iterator
        public T next() {
            y0<T> y0Var = this.f3824b;
            int i11 = this.index;
            this.index = i11 + 1;
            return y0Var.m(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> p013kotlin.collections.s0 a(y0<T> y0Var) {
        p013kotlin.jvm.internal.s.k(y0Var, "<this>");
        return new a(y0Var);
    }

    public static final <T> Iterator<T> b(y0<T> y0Var) {
        p013kotlin.jvm.internal.s.k(y0Var, "<this>");
        return new b(y0Var);
    }
}
