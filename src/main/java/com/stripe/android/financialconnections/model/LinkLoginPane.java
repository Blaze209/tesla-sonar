package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.v, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002%*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b%\u0010\u0017R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010\u0017¨\u00060"}, d2 = {"Lcom/stripe/android/financialconnections/model/v;", "Landroid/os/Parcelable;", "", "title", "body", "aboveCta", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lcom/stripe/android/financialconnections/model/v;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "getTitle$annotations", "()V", "b", "getBody$annotations", "c", "getAboveCta$annotations", "getCta$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class LinkLoginPane implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aboveCta;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cta;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkLoginPane> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.v$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/LinkLoginPane.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/v;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/v;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/v;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<LinkLoginPane> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50574a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50574a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.LinkLoginPane", aVar, 4);
            m1Var.o("title", false);
            m1Var.o("body", false);
            m1Var.o("above_cta", false);
            m1Var.o("cta", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkLoginPane deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            String str5 = null;
            if (cVarB.i()) {
                n50.d dVar = n50.d.f93345a;
                String str6 = (String) cVarB.n(descriptor2, 0, dVar, null);
                String str7 = (String) cVarB.n(descriptor2, 1, dVar, null);
                String str8 = (String) cVarB.n(descriptor2, 2, dVar, null);
                str4 = (String) cVarB.n(descriptor2, 3, dVar, null);
                i11 = 15;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str5 = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, str5);
                        i12 |= 1;
                    } else if (iA == 1) {
                        str9 = (String) cVarB.n(descriptor2, 1, n50.d.f93345a, str9);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str10 = (String) cVarB.n(descriptor2, 2, n50.d.f93345a, str10);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str11 = (String) cVarB.n(descriptor2, 3, n50.d.f93345a, str11);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = str5;
                str2 = str9;
                str3 = str10;
                str4 = str11;
            }
            cVarB.c(descriptor2);
            return new LinkLoginPane(i11, str, str2, str3, str4, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, LinkLoginPane value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            LinkLoginPane.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{dVar, dVar, dVar, dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/v$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/v;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<LinkLoginPane> serializer() {
            return a.f50574a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.v$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<LinkLoginPane> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkLoginPane createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new LinkLoginPane(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkLoginPane[] newArray(int i11) {
            return new LinkLoginPane[i11];
        }
    }

    @jn0.e
    public /* synthetic */ LinkLoginPane(int i11, @ro0.o("title") @ro0.p(with = n50.d.class) String str, @ro0.o("body") @ro0.p(with = n50.d.class) String str2, @ro0.o("above_cta") @ro0.p(with = n50.d.class) String str3, @ro0.o("cta") @ro0.p(with = n50.d.class) String str4, v1 v1Var) {
        if (15 != (i11 & 15)) {
            h1.b(i11, 15, a.f50574a.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.aboveCta = str3;
        this.cta = str4;
    }

    public static final /* synthetic */ void e(LinkLoginPane self, uo0.d output, to0.f serialDesc) {
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 0, dVar, self.title);
        output.D(serialDesc, 1, dVar, self.body);
        output.D(serialDesc, 2, dVar, self.aboveCta);
        output.D(serialDesc, 3, dVar, self.cta);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkLoginPane)) {
            return false;
        }
        LinkLoginPane linkLoginPane = (LinkLoginPane) other;
        return p013kotlin.jvm.internal.s.f(this.title, linkLoginPane.title) && p013kotlin.jvm.internal.s.f(this.body, linkLoginPane.body) && p013kotlin.jvm.internal.s.f(this.aboveCta, linkLoginPane.aboveCta) && p013kotlin.jvm.internal.s.f(this.cta, linkLoginPane.cta);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "LinkLoginPane(title=" + this.title + ", body=" + this.body + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.cta);
    }

    public LinkLoginPane(String title, String body, String aboveCta, String cta) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(aboveCta, "aboveCta");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        this.title = title;
        this.body = body;
        this.aboveCta = aboveCta;
        this.cta = cta;
    }
}
