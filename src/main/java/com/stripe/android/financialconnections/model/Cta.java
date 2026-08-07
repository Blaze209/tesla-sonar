package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002$\u0013B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0016¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/model/k;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/r;", "icon", "", "text", "<init>", "(Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lcom/stripe/android/financialconnections/model/k;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/r;", "()Lcom/stripe/android/financialconnections/model/r;", "getIcon$annotations", "()V", "Ljava/lang/String;", "getText", "getText$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class Cta implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Cta> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/Cta.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/k;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/k;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/k;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<Cta> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50493a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50493a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.Cta", aVar, 2);
            m1Var.o("icon", true);
            m1Var.o("text", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cta deserialize(uo0.e decoder) {
            Image image;
            String str;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            v1 v1Var = null;
            if (cVarB.i()) {
                image = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, null);
                str = (String) cVarB.n(descriptor2, 1, n50.d.f93345a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                image = null;
                String str2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        image = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, image);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        str2 = (String) cVarB.n(descriptor2, 1, n50.d.f93345a, str2);
                        i12 |= 2;
                    }
                }
                str = str2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new Cta(i11, image, str, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, Cta value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            Cta.b(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(Image.a.f50552a), n50.d.f93345a};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/k$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/k;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<Cta> serializer() {
            return a.f50493a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Cta> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cta createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Cta(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Cta[] newArray(int i11) {
            return new Cta[i11];
        }
    }

    @jn0.e
    public /* synthetic */ Cta(int i11, @ro0.o("icon") Image image, @ro0.o("text") @ro0.p(with = n50.d.class) String str, v1 v1Var) {
        if (2 != (i11 & 2)) {
            h1.b(i11, 2, a.f50493a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.text = str;
    }

    public static final /* synthetic */ void b(Cta self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.icon != null) {
            output.y(serialDesc, 0, Image.a.f50552a, self.icon);
        }
        output.D(serialDesc, 1, n50.d.f93345a, self.text);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) other;
        return p013kotlin.jvm.internal.s.f(this.icon, cta.icon) && p013kotlin.jvm.internal.s.f(this.text, cta.text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Image image = this.icon;
        return ((image == null ? 0 : image.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "Cta(icon=" + this.icon + ", text=" + this.text + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.text);
    }

    public Cta(Image image, String text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        this.icon = image;
        this.text = text;
    }
}
