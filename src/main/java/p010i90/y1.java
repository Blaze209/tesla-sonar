package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f90.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\u0013\u0017B'\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Li90/y1;", "Li90/x1;", "", "errorMessageResId", "", "", "formatArgs", "<init>", "(I[Ljava/lang/Object;)V", "", "isValid", "()Z", DateTokenConverter.CONVERTER_KEY, "Li90/c0;", "a", "()Li90/c0;", "I", "e", "()I", "b", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "c", "Li90/y1$a;", "Li90/y1$b;", "Li90/y1$c;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class y1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorMessageResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] formatArgs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li90/y1$a;", "Li90/y1;", "<init>", "()V", "", "hasFocus", "c", "(Z)Z", "b", "()Z", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends y1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f77113c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(h.f64637y, null, 2, 0 == true ? 1 : 0);
        }

        @Override // p010i90.x1
        public boolean b() {
            return true;
        }

        @Override // p010i90.x1
        public boolean c(boolean hasFocus) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li90/y1$b;", "Li90/y1;", "", "errorMessageResId", "<init>", "(I)V", "", "hasFocus", "c", "(Z)Z", "b", "()Z", "I", "e", "()I", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends y1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int errorMessageResId;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i11) {
            super(i11, null, 2, 0 == true ? 1 : 0);
            this.errorMessageResId = i11;
        }

        @Override // p010i90.x1
        public boolean b() {
            return false;
        }

        @Override // p010i90.x1
        public boolean c(boolean hasFocus) {
            return !hasFocus;
        }

        @Override // p010i90.y1
        /* JADX INFO: renamed from: e, reason: from getter */
        protected int getErrorMessageResId() {
            return this.errorMessageResId;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Li90/y1$c;", "Li90/y1;", "", "errorMessageResId", "", "", "formatArgs", "", "preventMoreInput", "<init>", "(I[Ljava/lang/Object;Z)V", "hasFocus", "c", "(Z)Z", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "I", "e", "()I", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "Z", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends y1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int errorMessageResId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object[] formatArgs;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean preventMoreInput;

        public /* synthetic */ c(int i11, Object[] objArr, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : objArr, (i12 & 4) != 0 ? false : z11);
        }

        @Override // p010i90.x1
        public boolean b() {
            return false;
        }

        @Override // p010i90.x1
        public boolean c(boolean hasFocus) {
            return true;
        }

        @Override // p010i90.y1, p010i90.x1
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getPreventMoreInput() {
            return this.preventMoreInput;
        }

        @Override // p010i90.y1
        /* JADX INFO: renamed from: e, reason: from getter */
        protected int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        @Override // p010i90.y1
        /* JADX INFO: renamed from: f, reason: from getter */
        protected Object[] getFormatArgs() {
            return this.formatArgs;
        }

        public c(int i11, Object[] objArr, boolean z11) {
            super(i11, objArr, null);
            this.errorMessageResId = i11;
            this.formatArgs = objArr;
            this.preventMoreInput = z11;
        }
    }

    public /* synthetic */ y1(int i11, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, objArr);
    }

    @Override // p010i90.x1
    public c0 a() {
        return new c0(getErrorMessageResId(), getFormatArgs());
    }

    @Override // p010i90.x1
    /* JADX INFO: renamed from: d */
    public boolean getPreventMoreInput() {
        return false;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected int getErrorMessageResId() {
        return this.errorMessageResId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    protected Object[] getFormatArgs() {
        return this.formatArgs;
    }

    @Override // p010i90.x1
    public boolean isValid() {
        return false;
    }

    private y1(int i11, Object[] objArr) {
        this.errorMessageResId = i11;
        this.formatArgs = objArr;
    }

    public /* synthetic */ y1(int i11, Object[] objArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : objArr, null);
    }
}
