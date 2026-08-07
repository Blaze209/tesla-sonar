package com.stripe.android.customersheet;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import e40.g0;
import e40.i0;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u00052\u00020\u0001:\u0003\u0005\u000b\u0018J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\nJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0006J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/customersheet/b;", "", "Lcom/stripe/android/customersheet/b$c;", "", "Lcom/stripe/android/model/v0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentMethodId", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/stripe/android/model/a1;", "params", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/customersheet/b$b;", "paymentOption", "Ljn0/h0;", "u", "(Lcom/stripe/android/customersheet/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "", "c", "()Z", "canCreateSetupIntents", "t", "()Ljava/util/List;", "paymentMethodTypes", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f49737a;

    /* JADX INFO: renamed from: com.stripe.android.customersheet.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/b$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/customersheet/c;", "customerEphemeralKeyProvider", "Lcom/stripe/android/customersheet/r;", "setupIntentClientSecretProvider", "", "", "paymentMethodTypes", "Lcom/stripe/android/customersheet/b;", "a", "(Landroid/content/Context;Lcom/stripe/android/customersheet/c;Lcom/stripe/android/customersheet/r;Ljava/util/List;)Lcom/stripe/android/customersheet/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f49737a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(Companion companion, Context context, com.stripe.android.customersheet.c cVar, r rVar, List list, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                list = null;
            }
            return companion.a(context, cVar, rVar, list);
        }

        public final b a(Context context, com.stripe.android.customersheet.c customerEphemeralKeyProvider, r setupIntentClientSecretProvider, List<String> paymentMethodTypes) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(customerEphemeralKeyProvider, "customerEphemeralKeyProvider");
            i0.a aVarA = g0.a();
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            return aVarA.a(applicationContext).c(customerEphemeralKeyProvider).b(setupIntentClientSecretProvider).d(paymentMethodTypes).build().a();
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0004\u000f\n\r\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/customersheet/b$b;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/stripe/android/model/v0;", "paymentMethodProvider", "Lw70/j;", "b", "(Lwn0/l;)Lw70/j;", "Lw70/m;", "c", "()Lw70/m;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/customersheet/b$b$b;", "Lcom/stripe/android/customersheet/b$b$c;", "Lcom/stripe/android/customersheet/b$b$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractC0802b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/b$b$a;", "", "<init>", "()V", "", "id", "Lcom/stripe/android/customersheet/b$b;", "a", "(Ljava/lang/String;)Lcom/stripe/android/customersheet/b$b;", "Lw70/m;", "b", "(Lw70/m;)Lcom/stripe/android/customersheet/b$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AbstractC0802b a(String id2) {
                p013kotlin.jvm.internal.s.k(id2, "id");
                if (p013kotlin.jvm.internal.s.f(id2, "google_pay")) {
                    return C0803b.f49740c;
                }
                return p013kotlin.jvm.internal.s.f(id2, "link") ? c.f49741c : new StripeId(id2);
            }

            public final AbstractC0802b b(w70.m mVar) {
                p013kotlin.jvm.internal.s.k(mVar, "<this>");
                if (mVar instanceof w70.m.a) {
                    return C0803b.f49740c;
                }
                if (mVar instanceof w70.m.b) {
                    return c.f49741c;
                }
                if (mVar instanceof w70.m.c) {
                    return null;
                }
                if (mVar instanceof w70.m.PaymentMethod) {
                    return new StripeId(((w70.m.PaymentMethod) mVar).getId());
                }
                throw new NoWhenBranchMatchedException();
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/b$b$b;", "Lcom/stripe/android/customersheet/b$b;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0803b extends AbstractC0802b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0803b f49740c = new C0803b();

            private C0803b() {
                super("google_pay", null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$b$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/b$b$c;", "Lcom/stripe/android/customersheet/b$b;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends AbstractC0802b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f49741c = new c();

            private c() {
                super("link", null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/customersheet/b$b$d;", "Lcom/stripe/android/customersheet/b$b;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StripeId extends AbstractC0802b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StripeId(String id2) {
                super(id2, null);
                p013kotlin.jvm.internal.s.k(id2, "id");
                this.id = id2;
            }

            @Override // com.stripe.android.customersheet.b.AbstractC0802b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StripeId) && p013kotlin.jvm.internal.s.f(this.id, ((StripeId) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "StripeId(id=" + this.id + ")";
            }
        }

        public /* synthetic */ AbstractC0802b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getId() {
            return this.id;
        }

        public final w70.j b(wn0.l<? super String, PaymentMethod> paymentMethodProvider) {
            p013kotlin.jvm.internal.s.k(paymentMethodProvider, "paymentMethodProvider");
            if (this instanceof C0803b) {
                return w70.j.c.f121146b;
            }
            if (this instanceof c) {
                return w70.j.d.f121147b;
            }
            if (!(this instanceof StripeId)) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentMethod paymentMethodInvoke = paymentMethodProvider.invoke(getId());
            if (paymentMethodInvoke == null) {
                return null;
            }
            return new w70.j.Saved(paymentMethodInvoke, null, null, 6, null);
        }

        public final w70.m c() {
            if (this instanceof C0803b) {
                return w70.m.a.f121198a;
            }
            if (this instanceof c) {
                return w70.m.b.f121199a;
            }
            if (this instanceof StripeId) {
                return new w70.m.PaymentMethod(getId());
            }
            throw new NoWhenBranchMatchedException();
        }

        private AbstractC0802b(String str) {
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "T", "", "<init>", "()V", "a", "b", "c", "Lcom/stripe/android/customersheet/b$c$b;", "Lcom/stripe/android/customersheet/b$c$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/b$c$a;", "", "<init>", "()V", "T", "value", "Lcom/stripe/android/customersheet/b$c;", "b", "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/b$c;", "", "cause", "", "displayMessage", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/b$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T> c<T> a(Throwable cause, String displayMessage) {
                p013kotlin.jvm.internal.s.k(cause, "cause");
                return new C0804b(cause, displayMessage);
            }

            public final <T> c<T> b(T value) {
                return new C0805c(value);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/b$c$b;", "T", "Lcom/stripe/android/customersheet/b$c;", "", "cause", "", "displayMessage", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "b", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0804b<T> extends c<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String displayMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0804b(Throwable cause, String str) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
                this.displayMessage = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDisplayMessage() {
                return this.displayMessage;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/b$c$c;", "T", "Lcom/stripe/android/customersheet/b$c;", "value", "<init>", "(Ljava/lang/Object;)V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0805c<T> extends c<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final T value;

            public C0805c(T t11) {
                super(null);
                this.value = t11;
            }

            public final T a() {
                return this.value;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    Object a(Continuation<? super c<List<PaymentMethod>>> continuation);

    Object b(String str, Continuation<? super c<PaymentMethod>> continuation);

    boolean c();

    Object d(String str, Continuation<? super c<PaymentMethod>> continuation);

    Object e(String str, a1 a1Var, Continuation<? super c<PaymentMethod>> continuation);

    List<String> t();

    Object u(AbstractC0802b abstractC0802b, Continuation<? super c<h0>> continuation);

    Object v(Continuation<? super c<AbstractC0802b>> continuation);

    Object w(Continuation<? super c<String>> continuation);
}
