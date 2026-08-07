package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import com.content.StripeSdkModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0003\t\u000b\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/o;", "", "<init>", "()V", "", "msg", "", "t", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "(Ljava/lang/String;)V", "c", "Lcom/stripe/android/stripe3ds2/transaction/o$b;", "Lcom/stripe/android/stripe3ds2/transaction/o$c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/o$a;", "", "<init>", "()V", "", "enableLogging", "Lcom/stripe/android/stripe3ds2/transaction/o;", "a", "(Z)Lcom/stripe/android/stripe3ds2/transaction/o;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(boolean enableLogging) {
            return enableLogging ? c.f54055b : b.f54054b;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/o$b;", "Lcom/stripe/android/stripe3ds2/transaction/o;", "<init>", "()V", "", "msg", "", "t", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "(Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f54054b = new b();

        private b() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable t11) {
            s.k(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            s.k(msg, "msg");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/o$c;", "Lcom/stripe/android/stripe3ds2/transaction/o;", "<init>", "()V", "", "msg", "Ljn0/h0;", "b", "(Ljava/lang/String;)V", "", "t", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f54055b = new c();

        private c() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable t11) {
            s.k(msg, "msg");
            Log.e(StripeSdkModule.NAME, msg, t11);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            s.k(msg, "msg");
            Log.i(StripeSdkModule.NAME, msg);
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(String msg, Throwable t11);

    public abstract void b(String msg);

    private o() {
    }
}
