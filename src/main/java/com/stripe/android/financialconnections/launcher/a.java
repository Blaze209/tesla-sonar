package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.security.InvalidParameterException;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\u0011\fB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/a;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/a$c;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "", "c", "()Z", "a", "Lcom/stripe/android/financialconnections/a$b;", "()Lcom/stripe/android/financialconnections/a$b;", "b", "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "Lcom/stripe/android/financialconnections/launcher/a$a;", "Lcom/stripe/android/financialconnections/launcher/a$b;", "Lcom/stripe/android/financialconnections/launcher/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/a$a;", "Lcom/stripe/android/financialconnections/launcher/a;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lcom/stripe/android/financialconnections/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/financialconnections/a$b;", "a", "()Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForData extends a {
        public static final Parcelable.Creator<ForData> CREATOR = new C0824a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.Configuration configuration;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0824a implements Parcelable.Creator<ForData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ForData createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ForData(com.stripe.android.financialconnections.a.Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ForData[] newArray(int i11) {
                return new ForData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ForData(com.stripe.android.financialconnections.a.Configuration configuration) {
            super(configuration, null, 0 == true ? 1 : 0);
            s.k(configuration, "configuration");
            this.configuration = configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.financialconnections.a.Configuration getConfiguration() {
            return this.configuration;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ForData) && s.f(this.configuration, ((ForData) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "ForData(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.configuration.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/stripe/android/financialconnections/launcher/a$b;", "Lcom/stripe/android/financialconnections/launcher/a;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/financialconnections/a$b;", "a", "()Lcom/stripe/android/financialconnections/a$b;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/a$c;", "b", "()Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForInstantDebits extends a {
        public static final Parcelable.Creator<ForInstantDebits> CREATOR = new C0825a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.Configuration configuration;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0825a implements Parcelable.Creator<ForInstantDebits> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ForInstantDebits createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ForInstantDebits(com.stripe.android.financialconnections.a.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.stripe.android.financialconnections.a.ElementsSessionContext.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ForInstantDebits[] newArray(int i11) {
                return new ForInstantDebits[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForInstantDebits(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
            super(configuration, elementsSessionContext, null);
            s.k(configuration, "configuration");
            this.configuration = configuration;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // com.stripe.android.financialconnections.launcher.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.financialconnections.a.Configuration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForInstantDebits)) {
                return false;
            }
            ForInstantDebits forInstantDebits = (ForInstantDebits) other;
            return s.f(this.configuration, forInstantDebits.configuration) && s.f(this.elementsSessionContext, forInstantDebits.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = this.configuration.hashCode() * 31;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "ForInstantDebits(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.configuration.writeToParcel(parcel, flags);
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                elementsSessionContext.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/a$c;", "Lcom/stripe/android/financialconnections/launcher/a;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "<init>", "(Lcom/stripe/android/financialconnections/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/financialconnections/a$b;", "a", "()Lcom/stripe/android/financialconnections/a$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForToken extends a {
        public static final Parcelable.Creator<ForToken> CREATOR = new C0826a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.Configuration configuration;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0826a implements Parcelable.Creator<ForToken> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ForToken createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ForToken(com.stripe.android.financialconnections.a.Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ForToken[] newArray(int i11) {
                return new ForToken[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ForToken(com.stripe.android.financialconnections.a.Configuration configuration) {
            super(configuration, null, 0 == true ? 1 : 0);
            s.k(configuration, "configuration");
            this.configuration = configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.financialconnections.a.Configuration getConfiguration() {
            return this.configuration;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ForToken) && s.f(this.configuration, ((ForToken) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "ForToken(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.configuration.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ a(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(configuration, elementsSessionContext);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public com.stripe.android.financialconnections.a.Configuration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    public final boolean c() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            d();
            objB = jn0.s.b(h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return jn0.s.h(objB);
    }

    public final void d() {
        if (p013kotlin.text.t.y0(getConfiguration().getFinancialConnectionsSessionClientSecret())) {
            throw new InvalidParameterException("The session client secret cannot be an empty string.");
        }
        if (p013kotlin.text.t.y0(getConfiguration().getPublishableKey())) {
            throw new InvalidParameterException("The publishable key cannot be an empty string.");
        }
    }

    private a(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        this.configuration = configuration;
        this.elementsSessionContext = elementsSessionContext;
    }
}
