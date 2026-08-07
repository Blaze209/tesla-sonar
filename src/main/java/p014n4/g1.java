package p014n4;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ln4/g1;", "Lr2/y3;", "", "", "f", "()Z", "cacheable", "a", "b", "Ln4/g1$a;", "Ln4/g1$b;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g1 extends y3<Object> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln4/g1$a;", "Ln4/g1;", "Lr2/y3;", "", "Ln4/l;", "current", "<init>", "(Ln4/l;)V", "a", "Ln4/l;", "getCurrent$ui_text_release", "()Ln4/l;", "getValue", "()Ljava/lang/Object;", "value", "", "f", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g1, y3<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l current;

        public a(l lVar) {
            this.current = lVar;
        }

        @Override // p014n4.g1
        /* JADX INFO: renamed from: f */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @Override // p020r2.y3
        public Object getValue() {
            return this.current.getValue();
        }
    }

    /* JADX INFO: renamed from: f */
    boolean getCacheable();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln4/g1$b;", "Ln4/g1;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "f", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean cacheable;

        public b(Object obj, boolean z11) {
            this.value = obj;
            this.cacheable = z11;
        }

        @Override // p014n4.g1
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // p020r2.y3
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ b(Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? true : z11);
        }
    }
}
