package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Li90/z1;", "Li90/x1;", "<init>", "()V", "", "hasFocus", "c", "(Z)Z", "isValid", "()Z", "Li90/c0;", "a", "()Li90/c0;", "b", "Li90/z1$a;", "Li90/z1$b;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class z1 implements x1 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/z1$a;", "Li90/z1;", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends z1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f77176a = new a();

        private a() {
            super(null);
        }

        @Override // p010i90.x1
        public boolean d() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/z1$b;", "Li90/z1;", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends z1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f77177a = new b();

        private b() {
            super(null);
        }

        @Override // p010i90.x1
        public boolean d() {
            return false;
        }
    }

    public /* synthetic */ z1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p010i90.x1
    public c0 a() {
        return null;
    }

    @Override // p010i90.x1
    public boolean b() {
        return false;
    }

    @Override // p010i90.x1
    public boolean c(boolean hasFocus) {
        return false;
    }

    @Override // p010i90.x1
    public boolean isValid() {
        return true;
    }

    private z1() {
    }
}
