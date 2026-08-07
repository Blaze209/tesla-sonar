package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import n70.DisplayableSavedPaymentMethod;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\t\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/t;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/t$e;", "a", "()Lcom/stripe/android/paymentsheet/t$e;", "viewType", "", "b", "()Z", "isEnabledDuringEditing", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/stripe/android/paymentsheet/t$a;", "Lcom/stripe/android/paymentsheet/t$b;", "Lcom/stripe/android/paymentsheet/t$c;", "Lcom/stripe/android/paymentsheet/t$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class t {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/t$a;", "Lcom/stripe/android/paymentsheet/t;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/t$e;", "b", "Lcom/stripe/android/paymentsheet/t$e;", "a", "()Lcom/stripe/android/paymentsheet/t$e;", "viewType", "", "c", "Z", "()Z", "isEnabledDuringEditing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53567a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e viewType = e.AddCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isEnabledDuringEditing = false;

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.t
        /* JADX INFO: renamed from: a */
        public e getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.t
        public boolean b() {
            return isEnabledDuringEditing;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/t$b;", "Lcom/stripe/android/paymentsheet/t;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/t$e;", "b", "Lcom/stripe/android/paymentsheet/t$e;", "a", "()Lcom/stripe/android/paymentsheet/t$e;", "viewType", "", "c", "Z", "()Z", "isEnabledDuringEditing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f53570a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e viewType = e.GooglePay;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isEnabledDuringEditing = false;

        private b() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.t
        /* JADX INFO: renamed from: a */
        public e getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.t
        public boolean b() {
            return isEnabledDuringEditing;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/t$c;", "Lcom/stripe/android/paymentsheet/t;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/t$e;", "b", "Lcom/stripe/android/paymentsheet/t$e;", "a", "()Lcom/stripe/android/paymentsheet/t$e;", "viewType", "", "c", "Z", "()Z", "isEnabledDuringEditing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f53573a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e viewType = e.Link;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isEnabledDuringEditing = false;

        private c() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.t
        /* JADX INFO: renamed from: a */
        public e getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.t
        public boolean b() {
            return isEnabledDuringEditing;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.t$d, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001b\u0010*\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001b\u0010,\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0016\u0010)¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/t$d;", "Lcom/stripe/android/paymentsheet/t;", "Ln70/g;", "displayableSavedPaymentMethod", "", "canRemovePaymentMethods", "<init>", "(Ln70/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/g;", DateTokenConverter.CONVERTER_KEY, "()Ln70/g;", "b", "Z", "Lcom/stripe/android/paymentsheet/t$e;", "c", "Lcom/stripe/android/paymentsheet/t$e;", "()Lcom/stripe/android/paymentsheet/t$e;", "viewType", "Lx30/c;", "Lx30/c;", "getDisplayName", "()Lx30/c;", "displayName", "Lcom/stripe/android/model/v0;", "e", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentMethod", "f", "Lkotlin/Lazy;", "()Z", "isModifiable", "g", "isEnabledDuringEditing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavedPaymentMethod extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DisplayableSavedPaymentMethod displayableSavedPaymentMethod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemovePaymentMethods;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final e viewType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final x30.c displayName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod paymentMethod;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Lazy isModifiable;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Lazy isEnabledDuringEditing;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.t$d$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(SavedPaymentMethod.this.f() || SavedPaymentMethod.this.canRemovePaymentMethods);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.t$d$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
            b() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(SavedPaymentMethod.this.getDisplayableSavedPaymentMethod().f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedPaymentMethod(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z11) {
            super(null);
            p013kotlin.jvm.internal.s.k(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.displayableSavedPaymentMethod = displayableSavedPaymentMethod;
            this.canRemovePaymentMethods = z11;
            this.viewType = e.SavedPaymentMethod;
            this.displayName = displayableSavedPaymentMethod.getDisplayName();
            this.paymentMethod = displayableSavedPaymentMethod.getPaymentMethod();
            this.isModifiable = jn0.m.b(new b());
            this.isEnabledDuringEditing = jn0.m.b(new a());
        }

        @Override // com.stripe.android.paymentsheet.t
        /* JADX INFO: renamed from: a, reason: from getter */
        public e getViewType() {
            return this.viewType;
        }

        @Override // com.stripe.android.paymentsheet.t
        public boolean b() {
            return ((Boolean) this.isEnabledDuringEditing.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DisplayableSavedPaymentMethod getDisplayableSavedPaymentMethod() {
            return this.displayableSavedPaymentMethod;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedPaymentMethod)) {
                return false;
            }
            SavedPaymentMethod savedPaymentMethod = (SavedPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.displayableSavedPaymentMethod, savedPaymentMethod.displayableSavedPaymentMethod) && this.canRemovePaymentMethods == savedPaymentMethod.canRemovePaymentMethods;
        }

        public final boolean f() {
            return ((Boolean) this.isModifiable.getValue()).booleanValue();
        }

        public int hashCode() {
            return (this.displayableSavedPaymentMethod.hashCode() * 31) + Boolean.hashCode(this.canRemovePaymentMethods);
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.displayableSavedPaymentMethod + ", canRemovePaymentMethods=" + this.canRemovePaymentMethods + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/t$e;", "", "<init>", "(Ljava/lang/String;I)V", "SavedPaymentMethod", "AddCard", "GooglePay", "Link", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum e {
        SavedPaymentMethod,
        AddCard,
        GooglePay,
        Link;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract e getViewType();

    public abstract boolean b();

    private t() {
    }
}
