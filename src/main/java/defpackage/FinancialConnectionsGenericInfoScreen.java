package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;
import ro0.p;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.h;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: g, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0006\u001b.20\u0019\u0000B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJJ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010*\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lg;", "Landroid/os/Parcelable;", "", "id", "Lg$f;", "header", "Lg$b;", "body", "Lg$e;", com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.type, "Lg$g;", "options", "<init>", "(Ljava/lang/String;Lg$f;Lg$b;Lg$e;Lg$g;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lg$f;Lg$b;Lg$e;Lg$g;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lg;Luo0/d;Lto0/f;)V", "a", "(Ljava/lang/String;Lg$f;Lg$b;Lg$e;Lg$g;)Lg;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "Lg$f;", "e", "()Lg$f;", "c", "Lg$b;", "()Lg$b;", DateTokenConverter.CONVERTER_KEY, "Lg$e;", "()Lg$e;", "Lg$g;", "getOptions", "()Lg$g;", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class FinancialConnectionsGenericInfoScreen implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Header header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Body body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Footer footer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Options options;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66761f = 8;
    public static final Parcelable.Creator<FinancialConnectionsGenericInfoScreen> CREATOR = new d();

    /* JADX INFO: renamed from: g$a */
    @e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.$serializer", "Lvo0/e0;", "Lg;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<FinancialConnectionsGenericInfoScreen> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66767a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f66767a = aVar;
            m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen", aVar, 5);
            m1Var.o("id", false);
            m1Var.o("header", true);
            m1Var.o("body", true);
            m1Var.o(com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.type, true);
            m1Var.o("options", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsGenericInfoScreen deserialize(uo0.e decoder) {
            int i11;
            String str;
            Header header;
            Body body;
            Footer footer;
            Options options;
            s.k(decoder, "decoder");
            f descriptor2 = getDescriptor();
            c cVarB = decoder.b(descriptor2);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                Header header2 = (Header) cVarB.v(descriptor2, 1, Header.a.f66808a, null);
                Body body2 = (Body) cVarB.v(descriptor2, 2, Body.a.f66771a, null);
                str = strT2;
                footer = (Footer) cVarB.v(descriptor2, 3, Footer.a.f66798a, null);
                options = (Options) cVarB.v(descriptor2, 4, Options.a.f66812a, null);
                body = body2;
                header = header2;
                i11 = 31;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Header header3 = null;
                Body body3 = null;
                Footer footer2 = null;
                Options options2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        header3 = (Header) cVarB.v(descriptor2, 1, Header.a.f66808a, header3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        body3 = (Body) cVarB.v(descriptor2, 2, Body.a.f66771a, body3);
                        i12 |= 4;
                    } else if (iA == 3) {
                        footer2 = (Footer) cVarB.v(descriptor2, 3, Footer.a.f66798a, footer2);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        options2 = (Options) cVarB.v(descriptor2, 4, Options.a.f66812a, options2);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                str = strT;
                header = header3;
                body = body3;
                footer = footer2;
                options = options2;
            }
            cVarB.c(descriptor2);
            return new FinancialConnectionsGenericInfoScreen(i11, str, header, body, footer, options, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsGenericInfoScreen value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsGenericInfoScreen.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{z1.f119730a, so0.a.p(Header.a.f66808a), so0.a.p(Body.a.f66771a), so0.a.p(Footer.a.f66798a), so0.a.p(Options.a.f66812a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: g$b, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0003$&)B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lg$b;", "Landroid/os/Parcelable;", "", "Lg$b$d;", "entries", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lg$b;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Companion", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Body implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d> entries;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f66768b = 8;
        public static final Parcelable.Creator<Body> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d<Object>[] f66769c = {new vo0.e(n50.a.f93342c)};

        /* JADX INFO: renamed from: g$b$a */
        /* JADX INFO: loaded from: classes4.dex */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.$serializer", "Lvo0/e0;", "Lg$b;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Body> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66771a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f66771a = aVar;
                m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body", aVar, 1);
                m1Var.o("entries", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Body deserialize(uo0.e decoder) {
                List list;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                ro0.d[] dVarArr = Body.f66769c;
                int i11 = 1;
                v1 v1Var = null;
                if (cVarB.i()) {
                    list = (List) cVarB.n(descriptor2, 0, dVarArr[0], null);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    List list2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            list2 = (List) cVarB.n(descriptor2, 0, dVarArr[0], list2);
                            i12 = 1;
                        }
                    }
                    list = list2;
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new Body(i11, list, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Body value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Body.c(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{Body.f66769c[0]};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: g$b$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Body> serializer() {
                return a.f66771a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: g$b$c */
        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Body> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Body createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(Body.class.getClassLoader()));
                }
                return new Body(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Body[] newArray(int i11) {
                return new Body[i11];
            }
        }

        /* JADX INFO: renamed from: g$b$d */
        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lg$b$d;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lg$b$d$a;", "Lg$b$d$c;", "Lg$b$d$d;", "Lg$b$d$e;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @p(with = n50.a.class)
        public static abstract class d implements Parcelable {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: g$b$d$a, reason: from toString */
            @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0003%\u0014,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lg$b$d$a;", "Lg$b$d;", "", "id", "", "Lg$b$d$a$d;", "bullets", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lg$b$d$a;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getBullets", "()Ljava/util/List;", "Companion", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @p
            public static final /* data */ class Bullets extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String id;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<GenericBulletPoint> bullets;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f66772c = 8;
                public static final Parcelable.Creator<Bullets> CREATOR = new c();

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final ro0.d<Object>[] f66773d = {null, new vo0.e(GenericBulletPoint.C1363a.f66781a)};

                /* JADX INFO: renamed from: g$b$d$a$a, reason: collision with other inner class name */
                /* JADX INFO: loaded from: classes5.dex */
                @e
                @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.$serializer", "Lvo0/e0;", "Lg$b$d$a;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b$d$a;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b$d$a;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class C1360a implements e0<Bullets> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C1360a f66776a;
                    private static final /* synthetic */ m1 descriptor;

                    static {
                        C1360a c1360a = new C1360a();
                        f66776a = c1360a;
                        m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets", c1360a, 2);
                        m1Var.o("id", false);
                        m1Var.o("bullets", false);
                        descriptor = m1Var;
                    }

                    private C1360a() {
                    }

                    @Override // ro0.c
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Bullets deserialize(uo0.e decoder) {
                        List list;
                        String strT;
                        int i11;
                        s.k(decoder, "decoder");
                        f descriptor2 = getDescriptor();
                        uo0.c cVarB = decoder.b(descriptor2);
                        ro0.d[] dVarArr = Bullets.f66773d;
                        v1 v1Var = null;
                        if (cVarB.i()) {
                            strT = cVarB.t(descriptor2, 0);
                            list = (List) cVarB.n(descriptor2, 1, dVarArr[1], null);
                            i11 = 3;
                        } else {
                            boolean z11 = true;
                            int i12 = 0;
                            List list2 = null;
                            String strT2 = null;
                            while (z11) {
                                int iA = cVarB.A(descriptor2);
                                if (iA == -1) {
                                    z11 = false;
                                } else if (iA == 0) {
                                    strT2 = cVarB.t(descriptor2, 0);
                                    i12 |= 1;
                                } else {
                                    if (iA != 1) {
                                        throw new UnknownFieldException(iA);
                                    }
                                    list2 = (List) cVarB.n(descriptor2, 1, dVarArr[1], list2);
                                    i12 |= 2;
                                }
                            }
                            list = list2;
                            strT = strT2;
                            i11 = i12;
                        }
                        cVarB.c(descriptor2);
                        return new Bullets(i11, strT, list, v1Var);
                    }

                    @Override // ro0.q
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void serialize(uo0.f encoder, Bullets value) {
                        s.k(encoder, "encoder");
                        s.k(value, "value");
                        f descriptor2 = getDescriptor();
                        uo0.d dVarB = encoder.b(descriptor2);
                        Bullets.b(value, dVarB, descriptor2);
                        dVarB.c(descriptor2);
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] childSerializers() {
                        return new ro0.d[]{z1.f119730a, Bullets.f66773d[1]};
                    }

                    @Override // ro0.d, ro0.q, ro0.c
                    public f getDescriptor() {
                        return descriptor;
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] typeParametersSerializers() {
                        return e0.a.a(this);
                    }
                }

                /* JADX INFO: renamed from: g$b$d$a$b, reason: collision with other inner class name and from kotlin metadata */
                /* JADX INFO: loaded from: classes5.dex */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$a$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d$a;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final ro0.d<Bullets> serializer() {
                        return C1360a.f66776a;
                    }

                    private Companion() {
                    }
                }

                /* JADX INFO: renamed from: g$b$d$a$c */
                /* JADX INFO: loaded from: classes5.dex */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class c implements Parcelable.Creator<Bullets> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Bullets createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        String string = parcel.readString();
                        int i11 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i11);
                        for (int i12 = 0; i12 != i11; i12++) {
                            arrayList.add(GenericBulletPoint.CREATOR.createFromParcel(parcel));
                        }
                        return new Bullets(string, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Bullets[] newArray(int i11) {
                        return new Bullets[i11];
                    }
                }

                /* JADX INFO: renamed from: g$b$d$a$d, reason: collision with other inner class name and from toString */
                /* JADX INFO: loaded from: classes5.dex */
                @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002\u0015(B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u0018¨\u00061"}, d2 = {"Lg$b$d$a$d;", "Landroid/os/Parcelable;", "", "id", "Lcom/stripe/android/financialconnections/model/r;", "icon", "title", "content", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lg$b$d$a$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/financialconnections/model/r;", "getIcon", "()Lcom/stripe/android/financialconnections/model/r;", "c", "getTitle", DateTokenConverter.CONVERTER_KEY, "getContent", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @p
                public static final /* data */ class GenericBulletPoint implements Parcelable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String id;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final com.stripe.android.financialconnections.model.Image icon;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String title;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String content;

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<GenericBulletPoint> CREATOR = new c();

                    /* JADX INFO: renamed from: g$b$d$a$d$a, reason: collision with other inner class name */
                    @e
                    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint.$serializer", "Lvo0/e0;", "Lg$b$d$a$d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b$d$a$d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b$d$a$d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class C1363a implements e0<GenericBulletPoint> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final C1363a f66781a;
                        private static final /* synthetic */ m1 descriptor;

                        static {
                            C1363a c1363a = new C1363a();
                            f66781a = c1363a;
                            m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint", c1363a, 4);
                            m1Var.o("id", false);
                            m1Var.o("icon", true);
                            m1Var.o("title", true);
                            m1Var.o("content", true);
                            descriptor = m1Var;
                        }

                        private C1363a() {
                        }

                        @Override // ro0.c
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public GenericBulletPoint deserialize(uo0.e decoder) {
                            int i11;
                            String str;
                            com.stripe.android.financialconnections.model.Image image;
                            String str2;
                            String str3;
                            s.k(decoder, "decoder");
                            f descriptor2 = getDescriptor();
                            uo0.c cVarB = decoder.b(descriptor2);
                            String strT = null;
                            if (cVarB.i()) {
                                String strT2 = cVarB.t(descriptor2, 0);
                                com.stripe.android.financialconnections.model.Image image2 = (com.stripe.android.financialconnections.model.Image) cVarB.v(descriptor2, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, null);
                                z1 z1Var = z1.f119730a;
                                String str4 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                                str = strT2;
                                str3 = (String) cVarB.v(descriptor2, 3, z1Var, null);
                                str2 = str4;
                                image = image2;
                                i11 = 15;
                            } else {
                                boolean z11 = true;
                                int i12 = 0;
                                com.stripe.android.financialconnections.model.Image image3 = null;
                                String str5 = null;
                                String str6 = null;
                                while (z11) {
                                    int iA = cVarB.A(descriptor2);
                                    if (iA == -1) {
                                        z11 = false;
                                    } else if (iA == 0) {
                                        strT = cVarB.t(descriptor2, 0);
                                        i12 |= 1;
                                    } else if (iA == 1) {
                                        image3 = (com.stripe.android.financialconnections.model.Image) cVarB.v(descriptor2, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, image3);
                                        i12 |= 2;
                                    } else if (iA == 2) {
                                        str5 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str5);
                                        i12 |= 4;
                                    } else {
                                        if (iA != 3) {
                                            throw new UnknownFieldException(iA);
                                        }
                                        str6 = (String) cVarB.v(descriptor2, 3, z1.f119730a, str6);
                                        i12 |= 8;
                                    }
                                }
                                i11 = i12;
                                str = strT;
                                image = image3;
                                str2 = str5;
                                str3 = str6;
                            }
                            cVarB.c(descriptor2);
                            return new GenericBulletPoint(i11, str, image, str2, str3, null);
                        }

                        @Override // ro0.q
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public void serialize(uo0.f encoder, GenericBulletPoint value) {
                            s.k(encoder, "encoder");
                            s.k(value, "value");
                            f descriptor2 = getDescriptor();
                            uo0.d dVarB = encoder.b(descriptor2);
                            GenericBulletPoint.a(value, dVarB, descriptor2);
                            dVarB.c(descriptor2);
                        }

                        @Override // vo0.e0
                        public ro0.d<?>[] childSerializers() {
                            z1 z1Var = z1.f119730a;
                            return new ro0.d[]{z1Var, so0.a.p(com.stripe.android.financialconnections.model.Image.a.f50552a), so0.a.p(z1Var), so0.a.p(z1Var)};
                        }

                        @Override // ro0.d, ro0.q, ro0.c
                        public f getDescriptor() {
                            return descriptor;
                        }

                        @Override // vo0.e0
                        public ro0.d<?>[] typeParametersSerializers() {
                            return e0.a.a(this);
                        }
                    }

                    /* JADX INFO: renamed from: g$b$d$a$d$b, reason: collision with other inner class name and from kotlin metadata */
                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$a$d$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d$a$d;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final ro0.d<GenericBulletPoint> serializer() {
                            return C1363a.f66781a;
                        }

                        private Companion() {
                        }
                    }

                    /* JADX INFO: renamed from: g$b$d$a$d$c */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class c implements Parcelable.Creator<GenericBulletPoint> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final GenericBulletPoint createFromParcel(Parcel parcel) {
                            s.k(parcel, "parcel");
                            return new GenericBulletPoint(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.financialconnections.model.Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final GenericBulletPoint[] newArray(int i11) {
                            return new GenericBulletPoint[i11];
                        }
                    }

                    @e
                    public /* synthetic */ GenericBulletPoint(int i11, String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3, v1 v1Var) {
                        if (1 != (i11 & 1)) {
                            h1.b(i11, 1, C1363a.f66781a.getDescriptor());
                        }
                        this.id = str;
                        if ((i11 & 2) == 0) {
                            this.icon = null;
                        } else {
                            this.icon = image;
                        }
                        if ((i11 & 4) == 0) {
                            this.title = null;
                        } else {
                            this.title = str2;
                        }
                        if ((i11 & 8) == 0) {
                            this.content = null;
                        } else {
                            this.content = str3;
                        }
                    }

                    public static final /* synthetic */ void a(GenericBulletPoint self, uo0.d output, f serialDesc) {
                        output.e(serialDesc, 0, self.id);
                        if (output.G(serialDesc, 1) || self.icon != null) {
                            output.y(serialDesc, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, self.icon);
                        }
                        if (output.G(serialDesc, 2) || self.title != null) {
                            output.y(serialDesc, 2, z1.f119730a, self.title);
                        }
                        if (!output.G(serialDesc, 3) && self.content == null) {
                            return;
                        }
                        output.y(serialDesc, 3, z1.f119730a, self.content);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof GenericBulletPoint)) {
                            return false;
                        }
                        GenericBulletPoint genericBulletPoint = (GenericBulletPoint) other;
                        return s.f(this.id, genericBulletPoint.id) && s.f(this.icon, genericBulletPoint.icon) && s.f(this.title, genericBulletPoint.title) && s.f(this.content, genericBulletPoint.content);
                    }

                    public int hashCode() {
                        int iHashCode = this.id.hashCode() * 31;
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
                        String str = this.title;
                        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.content;
                        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                    }

                    public String toString() {
                        return "GenericBulletPoint(id=" + this.id + ", icon=" + this.icon + ", title=" + this.title + ", content=" + this.content + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        s.k(parcel, "out");
                        parcel.writeString(this.id);
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        if (image == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            image.writeToParcel(parcel, flags);
                        }
                        parcel.writeString(this.title);
                        parcel.writeString(this.content);
                    }

                    public GenericBulletPoint(String id2, com.stripe.android.financialconnections.model.Image image, String str, String str2) {
                        s.k(id2, "id");
                        this.id = id2;
                        this.icon = image;
                        this.title = str;
                        this.content = str2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @e
                public /* synthetic */ Bullets(int i11, String str, List list, v1 v1Var) {
                    super(null);
                    if (3 != (i11 & 3)) {
                        h1.b(i11, 3, C1360a.f66776a.getDescriptor());
                    }
                    this.id = str;
                    this.bullets = list;
                }

                public static final /* synthetic */ void b(Bullets self, uo0.d output, f serialDesc) {
                    ro0.d<Object>[] dVarArr = f66773d;
                    output.e(serialDesc, 0, self.getId());
                    output.D(serialDesc, 1, dVarArr[1], self.bullets);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Bullets)) {
                        return false;
                    }
                    Bullets bullets = (Bullets) other;
                    return s.f(this.id, bullets.id) && s.f(this.bullets, bullets.bullets);
                }

                public String getId() {
                    return this.id;
                }

                public int hashCode() {
                    return (this.id.hashCode() * 31) + this.bullets.hashCode();
                }

                public String toString() {
                    return "Bullets(id=" + this.id + ", bullets=" + this.bullets + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.id);
                    List<GenericBulletPoint> list = this.bullets;
                    parcel.writeInt(list.size());
                    Iterator<GenericBulletPoint> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().writeToParcel(parcel, flags);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Bullets(String id2, List<GenericBulletPoint> bullets) {
                    super(null);
                    s.k(id2, "id");
                    s.k(bullets, "bullets");
                    this.id = id2;
                    this.bullets = bullets;
                }
            }

            /* JADX INFO: renamed from: g$b$d$b, reason: collision with other inner class name and from kotlin metadata */
            /* JADX INFO: loaded from: classes5.dex */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ro0.d<d> serializer() {
                    return n50.a.f93342c;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: g$b$d$c, reason: from toString */
            /* JADX INFO: loaded from: classes5.dex */
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002%(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b%\u0010\u0017¨\u0006,"}, d2 = {"Lg$b$d$c;", "Lg$b$d;", "", "id", "Lcom/stripe/android/financialconnections/model/r;", "image", "alt", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lg$b$d$c;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/financialconnections/model/r;", "()Lcom/stripe/android/financialconnections/model/r;", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @p
            public static final /* data */ class Image extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String id;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final com.stripe.android.financialconnections.model.Image image;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String alt;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Image> CREATOR = new C1367c();

                /* JADX INFO: renamed from: g$b$d$c$a */
                /* JADX INFO: loaded from: classes6.dex */
                @e
                @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Image.$serializer", "Lvo0/e0;", "Lg$b$d$c;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b$d$c;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b$d$c;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class a implements e0<Image> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f66785a;
                    private static final /* synthetic */ m1 descriptor;

                    static {
                        a aVar = new a();
                        f66785a = aVar;
                        m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body.Entry.Image", aVar, 3);
                        m1Var.o("id", false);
                        m1Var.o("image", false);
                        m1Var.o("alt", false);
                        descriptor = m1Var;
                    }

                    private a() {
                    }

                    @Override // ro0.c
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Image deserialize(uo0.e decoder) {
                        int i11;
                        String str;
                        com.stripe.android.financialconnections.model.Image image;
                        String strT;
                        s.k(decoder, "decoder");
                        f descriptor2 = getDescriptor();
                        uo0.c cVarB = decoder.b(descriptor2);
                        String strT2 = null;
                        if (cVarB.i()) {
                            String strT3 = cVarB.t(descriptor2, 0);
                            com.stripe.android.financialconnections.model.Image image2 = (com.stripe.android.financialconnections.model.Image) cVarB.n(descriptor2, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, null);
                            str = strT3;
                            strT = cVarB.t(descriptor2, 2);
                            image = image2;
                            i11 = 7;
                        } else {
                            boolean z11 = true;
                            int i12 = 0;
                            com.stripe.android.financialconnections.model.Image image3 = null;
                            String strT4 = null;
                            while (z11) {
                                int iA = cVarB.A(descriptor2);
                                if (iA == -1) {
                                    z11 = false;
                                } else if (iA == 0) {
                                    strT2 = cVarB.t(descriptor2, 0);
                                    i12 |= 1;
                                } else if (iA == 1) {
                                    image3 = (com.stripe.android.financialconnections.model.Image) cVarB.n(descriptor2, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, image3);
                                    i12 |= 2;
                                } else {
                                    if (iA != 2) {
                                        throw new UnknownFieldException(iA);
                                    }
                                    strT4 = cVarB.t(descriptor2, 2);
                                    i12 |= 4;
                                }
                            }
                            i11 = i12;
                            str = strT2;
                            image = image3;
                            strT = strT4;
                        }
                        cVarB.c(descriptor2);
                        return new Image(i11, str, image, strT, null);
                    }

                    @Override // ro0.q
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void serialize(uo0.f encoder, Image value) {
                        s.k(encoder, "encoder");
                        s.k(value, "value");
                        f descriptor2 = getDescriptor();
                        uo0.d dVarB = encoder.b(descriptor2);
                        Image.c(value, dVarB, descriptor2);
                        dVarB.c(descriptor2);
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] childSerializers() {
                        z1 z1Var = z1.f119730a;
                        return new ro0.d[]{z1Var, com.stripe.android.financialconnections.model.Image.a.f50552a, z1Var};
                    }

                    @Override // ro0.d, ro0.q, ro0.c
                    public f getDescriptor() {
                        return descriptor;
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] typeParametersSerializers() {
                        return e0.a.a(this);
                    }
                }

                /* JADX INFO: renamed from: g$b$d$c$b, reason: collision with other inner class name and from kotlin metadata */
                /* JADX INFO: loaded from: classes6.dex */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$c$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d$c;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final ro0.d<Image> serializer() {
                        return a.f66785a;
                    }

                    private Companion() {
                    }
                }

                /* JADX INFO: renamed from: g$b$d$c$c, reason: collision with other inner class name */
                /* JADX INFO: loaded from: classes6.dex */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C1367c implements Parcelable.Creator<Image> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Image createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new Image(parcel.readString(), com.stripe.android.financialconnections.model.Image.CREATOR.createFromParcel(parcel), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Image[] newArray(int i11) {
                        return new Image[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @e
                public /* synthetic */ Image(int i11, String str, com.stripe.android.financialconnections.model.Image image, String str2, v1 v1Var) {
                    super(null);
                    if (7 != (i11 & 7)) {
                        h1.b(i11, 7, a.f66785a.getDescriptor());
                    }
                    this.id = str;
                    this.image = image;
                    this.alt = str2;
                }

                public static final /* synthetic */ void c(Image self, uo0.d output, f serialDesc) {
                    output.e(serialDesc, 0, self.getId());
                    output.D(serialDesc, 1, com.stripe.android.financialconnections.model.Image.a.f50552a, self.image);
                    output.e(serialDesc, 2, self.alt);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAlt() {
                    return this.alt;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final com.stripe.android.financialconnections.model.Image getImage() {
                    return this.image;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return s.f(this.id, image.id) && s.f(this.image, image.image) && s.f(this.alt, image.alt);
                }

                public String getId() {
                    return this.id;
                }

                public int hashCode() {
                    return (((this.id.hashCode() * 31) + this.image.hashCode()) * 31) + this.alt.hashCode();
                }

                public String toString() {
                    return "Image(id=" + this.id + ", image=" + this.image + ", alt=" + this.alt + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.id);
                    this.image.writeToParcel(parcel, flags);
                    parcel.writeString(this.alt);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Image(String id2, com.stripe.android.financialconnections.model.Image image, String alt) {
                    super(null);
                    s.k(id2, "id");
                    s.k(image, "image");
                    s.k(alt, "alt");
                    this.id = id2;
                    this.image = image;
                    this.alt = alt;
                }
            }

            /* JADX INFO: renamed from: g$b$d$d, reason: collision with other inner class name and from toString */
            /* JADX INFO: loaded from: classes6.dex */
            @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002\u0005)B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b+\u0010/¨\u00061"}, d2 = {"Lg$b$d$d;", "Lg$b$d;", "", "id", "text", "La;", "alignment", "Lm;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;La;Lm;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;La;Lm;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lg$b$d$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "getText", "c", "La;", "()La;", "Lm;", "()Lm;", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @p
            public static final /* data */ class Text extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String id;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String text;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final defpackage.a alignment;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final m size;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Text> CREATOR = new c();

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final ro0.d<Object>[] f66786e = {null, null, defpackage.a.INSTANCE.serializer(), m.INSTANCE.serializer()};

                /* JADX INFO: renamed from: g$b$d$d$a */
                @e
                @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Text.$serializer", "Lvo0/e0;", "Lg$b$d$d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b$d$d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b$d$d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class a implements e0<Text> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f66791a;
                    private static final /* synthetic */ m1 descriptor;

                    static {
                        a aVar = new a();
                        f66791a = aVar;
                        m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body.Entry.Text", aVar, 4);
                        m1Var.o("id", false);
                        m1Var.o("text", false);
                        m1Var.o("alignment", true);
                        m1Var.o("size", true);
                        descriptor = m1Var;
                    }

                    private a() {
                    }

                    @Override // ro0.c
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Text deserialize(uo0.e decoder) {
                        int i11;
                        String str;
                        String str2;
                        defpackage.a aVar;
                        m mVar;
                        s.k(decoder, "decoder");
                        f descriptor2 = getDescriptor();
                        uo0.c cVarB = decoder.b(descriptor2);
                        ro0.d[] dVarArr = Text.f66786e;
                        String strT = null;
                        if (cVarB.i()) {
                            String strT2 = cVarB.t(descriptor2, 0);
                            String strT3 = cVarB.t(descriptor2, 1);
                            defpackage.a aVar2 = (defpackage.a) cVarB.v(descriptor2, 2, dVarArr[2], null);
                            mVar = (m) cVarB.v(descriptor2, 3, dVarArr[3], null);
                            str = strT2;
                            i11 = 15;
                            aVar = aVar2;
                            str2 = strT3;
                        } else {
                            boolean z11 = true;
                            int i12 = 0;
                            String strT4 = null;
                            defpackage.a aVar3 = null;
                            m mVar2 = null;
                            while (z11) {
                                int iA = cVarB.A(descriptor2);
                                if (iA == -1) {
                                    z11 = false;
                                } else if (iA == 0) {
                                    strT = cVarB.t(descriptor2, 0);
                                    i12 |= 1;
                                } else if (iA == 1) {
                                    strT4 = cVarB.t(descriptor2, 1);
                                    i12 |= 2;
                                } else if (iA == 2) {
                                    aVar3 = (defpackage.a) cVarB.v(descriptor2, 2, dVarArr[2], aVar3);
                                    i12 |= 4;
                                } else {
                                    if (iA != 3) {
                                        throw new UnknownFieldException(iA);
                                    }
                                    mVar2 = (m) cVarB.v(descriptor2, 3, dVarArr[3], mVar2);
                                    i12 |= 8;
                                }
                            }
                            i11 = i12;
                            str = strT;
                            str2 = strT4;
                            aVar = aVar3;
                            mVar = mVar2;
                        }
                        cVarB.c(descriptor2);
                        return new Text(i11, str, str2, aVar, mVar, null);
                    }

                    @Override // ro0.q
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void serialize(uo0.f encoder, Text value) {
                        s.k(encoder, "encoder");
                        s.k(value, "value");
                        f descriptor2 = getDescriptor();
                        uo0.d dVarB = encoder.b(descriptor2);
                        Text.d(value, dVarB, descriptor2);
                        dVarB.c(descriptor2);
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] childSerializers() {
                        ro0.d[] dVarArr = Text.f66786e;
                        ro0.d<?> dVarP = so0.a.p(dVarArr[2]);
                        ro0.d<?> dVarP2 = so0.a.p(dVarArr[3]);
                        z1 z1Var = z1.f119730a;
                        return new ro0.d[]{z1Var, z1Var, dVarP, dVarP2};
                    }

                    @Override // ro0.d, ro0.q, ro0.c
                    public f getDescriptor() {
                        return descriptor;
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] typeParametersSerializers() {
                        return e0.a.a(this);
                    }
                }

                /* JADX INFO: renamed from: g$b$d$d$b, reason: collision with other inner class name and from kotlin metadata */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$d$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d$d;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final ro0.d<Text> serializer() {
                        return a.f66791a;
                    }

                    private Companion() {
                    }
                }

                /* JADX INFO: renamed from: g$b$d$d$c */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class c implements Parcelable.Creator<Text> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Text createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new Text(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : defpackage.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? m.valueOf(parcel.readString()) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Text[] newArray(int i11) {
                        return new Text[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @e
                public /* synthetic */ Text(int i11, String str, String str2, defpackage.a aVar, m mVar, v1 v1Var) {
                    super(null);
                    if (3 != (i11 & 3)) {
                        h1.b(i11, 3, a.f66791a.getDescriptor());
                    }
                    this.id = str;
                    this.text = str2;
                    if ((i11 & 4) == 0) {
                        this.alignment = null;
                    } else {
                        this.alignment = aVar;
                    }
                    if ((i11 & 8) == 0) {
                        this.size = null;
                    } else {
                        this.size = mVar;
                    }
                }

                public static final /* synthetic */ void d(Text self, uo0.d output, f serialDesc) {
                    ro0.d<Object>[] dVarArr = f66786e;
                    output.e(serialDesc, 0, self.getId());
                    output.e(serialDesc, 1, self.text);
                    if (output.G(serialDesc, 2) || self.alignment != null) {
                        output.y(serialDesc, 2, dVarArr[2], self.alignment);
                    }
                    if (!output.G(serialDesc, 3) && self.size == null) {
                        return;
                    }
                    output.y(serialDesc, 3, dVarArr[3], self.size);
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final defpackage.a getAlignment() {
                    return this.alignment;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final m getSize() {
                    return this.size;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return s.f(this.id, text.id) && s.f(this.text, text.text) && this.alignment == text.alignment && this.size == text.size;
                }

                public String getId() {
                    return this.id;
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    int iHashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
                    defpackage.a aVar = this.alignment;
                    int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                    m mVar = this.size;
                    return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
                }

                public String toString() {
                    return "Text(id=" + this.id + ", text=" + this.text + ", alignment=" + this.alignment + ", size=" + this.size + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.id);
                    parcel.writeString(this.text);
                    defpackage.a aVar = this.alignment;
                    if (aVar == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(aVar.name());
                    }
                    m mVar = this.size;
                    if (mVar == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(mVar.name());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Text(String id2, String text, defpackage.a aVar, m mVar) {
                    super(null);
                    s.k(id2, "id");
                    s.k(text, "text");
                    this.id = id2;
                    this.text = text;
                    this.alignment = aVar;
                    this.size = mVar;
                }
            }

            /* JADX INFO: renamed from: g$b$d$e, reason: from toString */
            /* JADX INFO: loaded from: classes6.dex */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0011%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006&"}, d2 = {"Lg$b$d$e;", "Lg$b$d;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lg$b$d$e;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Companion", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @p
            public static final /* data */ class Unknown extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String id;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Unknown> CREATOR = new c();

                /* JADX INFO: renamed from: g$b$d$e$a */
                @e
                @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Unknown.$serializer", "Lvo0/e0;", "Lg$b$d$e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$b$d$e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$b$d$e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class a implements e0<Unknown> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f66793a;
                    private static final /* synthetic */ m1 descriptor;

                    static {
                        a aVar = new a();
                        f66793a = aVar;
                        m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Body.Entry.Unknown", aVar, 1);
                        m1Var.o("id", false);
                        descriptor = m1Var;
                    }

                    private a() {
                    }

                    @Override // ro0.c
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Unknown deserialize(uo0.e decoder) {
                        String strT;
                        s.k(decoder, "decoder");
                        f descriptor2 = getDescriptor();
                        uo0.c cVarB = decoder.b(descriptor2);
                        int i11 = 1;
                        v1 v1Var = null;
                        if (cVarB.i()) {
                            strT = cVarB.t(descriptor2, 0);
                        } else {
                            boolean z11 = true;
                            int i12 = 0;
                            strT = null;
                            while (z11) {
                                int iA = cVarB.A(descriptor2);
                                if (iA == -1) {
                                    z11 = false;
                                } else {
                                    if (iA != 0) {
                                        throw new UnknownFieldException(iA);
                                    }
                                    strT = cVarB.t(descriptor2, 0);
                                    i12 = 1;
                                }
                            }
                            i11 = i12;
                        }
                        cVarB.c(descriptor2);
                        return new Unknown(i11, strT, v1Var);
                    }

                    @Override // ro0.q
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void serialize(uo0.f encoder, Unknown value) {
                        s.k(encoder, "encoder");
                        s.k(value, "value");
                        f descriptor2 = getDescriptor();
                        uo0.d dVarB = encoder.b(descriptor2);
                        Unknown.a(value, dVarB, descriptor2);
                        dVarB.c(descriptor2);
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] childSerializers() {
                        return new ro0.d[]{z1.f119730a};
                    }

                    @Override // ro0.d, ro0.q, ro0.c
                    public f getDescriptor() {
                        return descriptor;
                    }

                    @Override // vo0.e0
                    public ro0.d<?>[] typeParametersSerializers() {
                        return e0.a.a(this);
                    }
                }

                /* JADX INFO: renamed from: g$b$d$e$b, reason: collision with other inner class name and from kotlin metadata */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$b$d$e$b;", "", "<init>", "()V", "Lro0/d;", "Lg$b$d$e;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final ro0.d<Unknown> serializer() {
                        return a.f66793a;
                    }

                    private Companion() {
                    }
                }

                /* JADX INFO: renamed from: g$b$d$e$c */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class c implements Parcelable.Creator<Unknown> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Unknown createFromParcel(Parcel parcel) {
                        s.k(parcel, "parcel");
                        return new Unknown(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Unknown[] newArray(int i11) {
                        return new Unknown[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @e
                public /* synthetic */ Unknown(int i11, String str, v1 v1Var) {
                    super(null);
                    if (1 != (i11 & 1)) {
                        h1.b(i11, 1, a.f66793a.getDescriptor());
                    }
                    this.id = str;
                }

                public static final /* synthetic */ void a(Unknown self, uo0.d output, f serialDesc) {
                    output.e(serialDesc, 0, self.getId());
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Unknown) && s.f(this.id, ((Unknown) other).id);
                }

                public String getId() {
                    return this.id;
                }

                public int hashCode() {
                    return this.id.hashCode();
                }

                public String toString() {
                    return "Unknown(id=" + this.id + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    s.k(parcel, "out");
                    parcel.writeString(this.id);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Unknown(String id2) {
                    super(null);
                    s.k(id2, "id");
                    this.id = id2;
                }
            }

            public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private d() {
            }
        }

        @e
        public /* synthetic */ Body(int i11, List list, v1 v1Var) {
            if (1 != (i11 & 1)) {
                h1.b(i11, 1, a.f66771a.getDescriptor());
            }
            this.entries = list;
        }

        public static final /* synthetic */ void c(Body self, uo0.d output, f serialDesc) {
            output.D(serialDesc, 0, f66769c[0], self.entries);
        }

        public final List<d> b() {
            return this.entries;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Body) && s.f(this.entries, ((Body) other).entries);
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return "Body(entries=" + this.entries + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            List<d> list = this.entries;
            parcel.writeInt(list.size());
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Body(List<? extends d> entries) {
            s.k(entries, "entries");
            this.entries = entries;
        }
    }

    /* JADX INFO: renamed from: g$c, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$c;", "", "<init>", "()V", "Lro0/d;", "Lg;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsGenericInfoScreen> serializer() {
            return a.f66767a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: g$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Parcelable.Creator<FinancialConnectionsGenericInfoScreen> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsGenericInfoScreen createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new FinancialConnectionsGenericInfoScreen(parcel.readString(), parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Body.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Options.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsGenericInfoScreen[] newArray(int i11) {
            return new FinancialConnectionsGenericInfoScreen[i11];
        }
    }

    /* JADX INFO: renamed from: g$e, reason: from toString */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0003&(.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBI\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010)\u0012\u0004\b0\u0010-\u001a\u0004\b&\u0010+¨\u00062"}, d2 = {"Lg$e;", "Landroid/os/Parcelable;", "", "disclaimer", "Lg$e$d;", "primaryCta", "secondaryCta", "belowCta", "<init>", "(Ljava/lang/String;Lg$e$d;Lg$e$d;Lg$e$d;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lg$e$d;Lg$e$d;Lg$e$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lg$e;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Lg$e$d;", "c", "()Lg$e$d;", "getPrimaryCta$annotations", "()V", DateTokenConverter.CONVERTER_KEY, "getSecondaryCta$annotations", "getBelowCta$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Footer implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String disclaimer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final GenericInfoAction primaryCta;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final GenericInfoAction secondaryCta;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final GenericInfoAction belowCta;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Footer> CREATOR = new c();

        /* JADX INFO: renamed from: g$e$a */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Footer.$serializer", "Lvo0/e0;", "Lg$e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Footer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66798a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f66798a = aVar;
                m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Footer", aVar, 4);
                m1Var.o("disclaimer", true);
                m1Var.o("primary_cta", true);
                m1Var.o("secondary_cta", true);
                m1Var.o("below_cta", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Footer deserialize(uo0.e decoder) {
                int i11;
                String str;
                GenericInfoAction genericInfoAction;
                GenericInfoAction genericInfoAction2;
                GenericInfoAction genericInfoAction3;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                String str2 = null;
                if (cVarB.i()) {
                    String str3 = (String) cVarB.v(descriptor2, 0, z1.f119730a, null);
                    GenericInfoAction.a aVar = GenericInfoAction.a.f66802a;
                    GenericInfoAction genericInfoAction4 = (GenericInfoAction) cVarB.v(descriptor2, 1, aVar, null);
                    GenericInfoAction genericInfoAction5 = (GenericInfoAction) cVarB.v(descriptor2, 2, aVar, null);
                    str = str3;
                    genericInfoAction3 = (GenericInfoAction) cVarB.v(descriptor2, 3, aVar, null);
                    genericInfoAction2 = genericInfoAction5;
                    genericInfoAction = genericInfoAction4;
                    i11 = 15;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    GenericInfoAction genericInfoAction6 = null;
                    GenericInfoAction genericInfoAction7 = null;
                    GenericInfoAction genericInfoAction8 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            str2 = (String) cVarB.v(descriptor2, 0, z1.f119730a, str2);
                            i12 |= 1;
                        } else if (iA == 1) {
                            genericInfoAction6 = (GenericInfoAction) cVarB.v(descriptor2, 1, GenericInfoAction.a.f66802a, genericInfoAction6);
                            i12 |= 2;
                        } else if (iA == 2) {
                            genericInfoAction7 = (GenericInfoAction) cVarB.v(descriptor2, 2, GenericInfoAction.a.f66802a, genericInfoAction7);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            genericInfoAction8 = (GenericInfoAction) cVarB.v(descriptor2, 3, GenericInfoAction.a.f66802a, genericInfoAction8);
                            i12 |= 8;
                        }
                    }
                    i11 = i12;
                    str = str2;
                    genericInfoAction = genericInfoAction6;
                    genericInfoAction2 = genericInfoAction7;
                    genericInfoAction3 = genericInfoAction8;
                }
                cVarB.c(descriptor2);
                return new Footer(i11, str, genericInfoAction, genericInfoAction2, genericInfoAction3, (v1) null);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Footer value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Footer.e(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                ro0.d<?> dVarP = so0.a.p(z1.f119730a);
                GenericInfoAction.a aVar = GenericInfoAction.a.f66802a;
                return new ro0.d[]{dVarP, so0.a.p(aVar), so0.a.p(aVar), so0.a.p(aVar)};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: g$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$e$b;", "", "<init>", "()V", "Lro0/d;", "Lg$e;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Footer> serializer() {
                return a.f66798a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: g$e$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Footer> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Footer createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : GenericInfoAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GenericInfoAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GenericInfoAction.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Footer[] newArray(int i11) {
                return new Footer[i11];
            }
        }

        /* JADX INFO: renamed from: g$e$d, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002%(B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b%\u0010*¨\u0006,"}, d2 = {"Lg$e$d;", "Landroid/os/Parcelable;", "", "id", AnnotatedPrivateKey.LABEL, "Lcom/stripe/android/financialconnections/model/r;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lg$e$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/financialconnections/model/r;", "()Lcom/stripe/android/financialconnections/model/r;", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @p
        public static final /* data */ class GenericInfoAction implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Image icon;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<GenericInfoAction> CREATOR = new c();

            /* JADX INFO: renamed from: g$e$d$a */
            @e
            @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction.$serializer", "Lvo0/e0;", "Lg$e$d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$e$d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$e$d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a implements e0<GenericInfoAction> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f66802a;
                private static final /* synthetic */ m1 descriptor;

                static {
                    a aVar = new a();
                    f66802a = aVar;
                    m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction", aVar, 3);
                    m1Var.o("id", false);
                    m1Var.o(AnnotatedPrivateKey.LABEL, false);
                    m1Var.o("icon", true);
                    descriptor = m1Var;
                }

                private a() {
                }

                @Override // ro0.c
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public GenericInfoAction deserialize(uo0.e decoder) {
                    int i11;
                    String str;
                    String str2;
                    Image image;
                    s.k(decoder, "decoder");
                    f descriptor2 = getDescriptor();
                    uo0.c cVarB = decoder.b(descriptor2);
                    String strT = null;
                    if (cVarB.i()) {
                        String strT2 = cVarB.t(descriptor2, 0);
                        String strT3 = cVarB.t(descriptor2, 1);
                        str = strT2;
                        image = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, null);
                        str2 = strT3;
                        i11 = 7;
                    } else {
                        boolean z11 = true;
                        int i12 = 0;
                        String strT4 = null;
                        Image image2 = null;
                        while (z11) {
                            int iA = cVarB.A(descriptor2);
                            if (iA == -1) {
                                z11 = false;
                            } else if (iA == 0) {
                                strT = cVarB.t(descriptor2, 0);
                                i12 |= 1;
                            } else if (iA == 1) {
                                strT4 = cVarB.t(descriptor2, 1);
                                i12 |= 2;
                            } else {
                                if (iA != 2) {
                                    throw new UnknownFieldException(iA);
                                }
                                image2 = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, image2);
                                i12 |= 4;
                            }
                        }
                        i11 = i12;
                        str = strT;
                        str2 = strT4;
                        image = image2;
                    }
                    cVarB.c(descriptor2);
                    return new GenericInfoAction(i11, str, str2, image, null);
                }

                @Override // ro0.q
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void serialize(uo0.f encoder, GenericInfoAction value) {
                    s.k(encoder, "encoder");
                    s.k(value, "value");
                    f descriptor2 = getDescriptor();
                    uo0.d dVarB = encoder.b(descriptor2);
                    GenericInfoAction.c(value, dVarB, descriptor2);
                    dVarB.c(descriptor2);
                }

                @Override // vo0.e0
                public ro0.d<?>[] childSerializers() {
                    ro0.d<?> dVarP = so0.a.p(Image.a.f50552a);
                    z1 z1Var = z1.f119730a;
                    return new ro0.d[]{z1Var, z1Var, dVarP};
                }

                @Override // ro0.d, ro0.q, ro0.c
                public f getDescriptor() {
                    return descriptor;
                }

                @Override // vo0.e0
                public ro0.d<?>[] typeParametersSerializers() {
                    return e0.a.a(this);
                }
            }

            /* JADX INFO: renamed from: g$e$d$b, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$e$d$b;", "", "<init>", "()V", "Lro0/d;", "Lg$e$d;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ro0.d<GenericInfoAction> serializer() {
                    return a.f66802a;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: g$e$d$c */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class c implements Parcelable.Creator<GenericInfoAction> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GenericInfoAction createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new GenericInfoAction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GenericInfoAction[] newArray(int i11) {
                    return new GenericInfoAction[i11];
                }
            }

            @e
            public /* synthetic */ GenericInfoAction(int i11, String str, String str2, Image image, v1 v1Var) {
                if (3 != (i11 & 3)) {
                    h1.b(i11, 3, a.f66802a.getDescriptor());
                }
                this.id = str;
                this.label = str2;
                if ((i11 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = image;
                }
            }

            public static final /* synthetic */ void c(GenericInfoAction self, uo0.d output, f serialDesc) {
                output.e(serialDesc, 0, self.id);
                output.e(serialDesc, 1, self.label);
                if (!output.G(serialDesc, 2) && self.icon == null) {
                    return;
                }
                output.y(serialDesc, 2, Image.a.f50552a, self.icon);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Image getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericInfoAction)) {
                    return false;
                }
                GenericInfoAction genericInfoAction = (GenericInfoAction) other;
                return s.f(this.id, genericInfoAction.id) && s.f(this.label, genericInfoAction.label) && s.f(this.icon, genericInfoAction.icon);
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
                Image image = this.icon;
                return iHashCode + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "GenericInfoAction(id=" + this.id + ", label=" + this.label + ", icon=" + this.icon + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.id);
                parcel.writeString(this.label);
                Image image = this.icon;
                if (image == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    image.writeToParcel(parcel, flags);
                }
            }

            public GenericInfoAction(String id2, String label, Image image) {
                s.k(id2, "id");
                s.k(label, "label");
                this.id = id2;
                this.label = label;
                this.icon = image;
            }
        }

        public Footer() {
            this((String) null, (GenericInfoAction) null, (GenericInfoAction) null, (GenericInfoAction) null, 15, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void e(Footer self, uo0.d output, f serialDesc) {
            if (output.G(serialDesc, 0) || self.disclaimer != null) {
                output.y(serialDesc, 0, z1.f119730a, self.disclaimer);
            }
            if (output.G(serialDesc, 1) || self.primaryCta != null) {
                output.y(serialDesc, 1, GenericInfoAction.a.f66802a, self.primaryCta);
            }
            if (output.G(serialDesc, 2) || self.secondaryCta != null) {
                output.y(serialDesc, 2, GenericInfoAction.a.f66802a, self.secondaryCta);
            }
            if (!output.G(serialDesc, 3) && self.belowCta == null) {
                return;
            }
            output.y(serialDesc, 3, GenericInfoAction.a.f66802a, self.belowCta);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInfoAction getBelowCta() {
            return this.belowCta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GenericInfoAction getPrimaryCta() {
            return this.primaryCta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final GenericInfoAction getSecondaryCta() {
            return this.secondaryCta;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return s.f(this.disclaimer, footer.disclaimer) && s.f(this.primaryCta, footer.primaryCta) && s.f(this.secondaryCta, footer.secondaryCta) && s.f(this.belowCta, footer.belowCta);
        }

        public int hashCode() {
            String str = this.disclaimer;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericInfoAction genericInfoAction = this.primaryCta;
            int iHashCode2 = (iHashCode + (genericInfoAction == null ? 0 : genericInfoAction.hashCode())) * 31;
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            int iHashCode3 = (iHashCode2 + (genericInfoAction2 == null ? 0 : genericInfoAction2.hashCode())) * 31;
            GenericInfoAction genericInfoAction3 = this.belowCta;
            return iHashCode3 + (genericInfoAction3 != null ? genericInfoAction3.hashCode() : 0);
        }

        public String toString() {
            return "Footer(disclaimer=" + this.disclaimer + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", belowCta=" + this.belowCta + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.disclaimer);
            GenericInfoAction genericInfoAction = this.primaryCta;
            if (genericInfoAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                genericInfoAction.writeToParcel(parcel, flags);
            }
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            if (genericInfoAction2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                genericInfoAction2.writeToParcel(parcel, flags);
            }
            GenericInfoAction genericInfoAction3 = this.belowCta;
            if (genericInfoAction3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                genericInfoAction3.writeToParcel(parcel, flags);
            }
        }

        @e
        public /* synthetic */ Footer(int i11, String str, @o("primary_cta") GenericInfoAction genericInfoAction, @o("secondary_cta") GenericInfoAction genericInfoAction2, @o("below_cta") GenericInfoAction genericInfoAction3, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.disclaimer = null;
            } else {
                this.disclaimer = str;
            }
            if ((i11 & 2) == 0) {
                this.primaryCta = null;
            } else {
                this.primaryCta = genericInfoAction;
            }
            if ((i11 & 4) == 0) {
                this.secondaryCta = null;
            } else {
                this.secondaryCta = genericInfoAction2;
            }
            if ((i11 & 8) == 0) {
                this.belowCta = null;
            } else {
                this.belowCta = genericInfoAction3;
            }
        }

        public Footer(String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, GenericInfoAction genericInfoAction3) {
            this.disclaimer = str;
            this.primaryCta = genericInfoAction;
            this.secondaryCta = genericInfoAction2;
            this.belowCta = genericInfoAction3;
        }

        public /* synthetic */ Footer(String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, GenericInfoAction genericInfoAction3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : genericInfoAction, (i11 & 4) != 0 ? null : genericInfoAction2, (i11 & 8) != 0 ? null : genericInfoAction3);
        }
    }

    /* JADX INFO: renamed from: g$f, reason: from toString */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 32\u00020\u0001:\u0002\u0007\u0018B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J@\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"Lg$f;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/stripe/android/financialconnections/model/r;", "icon", "La;", "alignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;La;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;La;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lg$f;Luo0/d;Lto0/f;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;La;)Lg$f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "g", "f", "c", "Lcom/stripe/android/financialconnections/model/r;", "e", "()Lcom/stripe/android/financialconnections/model/r;", DateTokenConverter.CONVERTER_KEY, "La;", "()La;", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Header implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Image icon;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final defpackage.a alignment;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Header> CREATOR = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ro0.d<Object>[] f66803e = {null, null, null, defpackage.a.INSTANCE.serializer()};

        /* JADX INFO: renamed from: g$f$a */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Header.$serializer", "Lvo0/e0;", "Lg$f;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$f;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$f;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Header> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66808a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f66808a = aVar;
                m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Header", aVar, 4);
                m1Var.o("title", true);
                m1Var.o("subtitle", true);
                m1Var.o("icon", true);
                m1Var.o("alignment", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Header deserialize(uo0.e decoder) {
                int i11;
                String str;
                String str2;
                Image image;
                defpackage.a aVar;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                ro0.d[] dVarArr = Header.f66803e;
                String str3 = null;
                if (cVarB.i()) {
                    z1 z1Var = z1.f119730a;
                    String str4 = (String) cVarB.v(descriptor2, 0, z1Var, null);
                    String str5 = (String) cVarB.v(descriptor2, 1, z1Var, null);
                    Image image2 = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, null);
                    aVar = (defpackage.a) cVarB.v(descriptor2, 3, dVarArr[3], null);
                    str2 = str5;
                    image = image2;
                    i11 = 15;
                    str = str4;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    String str6 = null;
                    Image image3 = null;
                    defpackage.a aVar2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            str3 = (String) cVarB.v(descriptor2, 0, z1.f119730a, str3);
                            i12 |= 1;
                        } else if (iA == 1) {
                            str6 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str6);
                            i12 |= 2;
                        } else if (iA == 2) {
                            image3 = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, image3);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            aVar2 = (defpackage.a) cVarB.v(descriptor2, 3, dVarArr[3], aVar2);
                            i12 |= 8;
                        }
                    }
                    i11 = i12;
                    str = str3;
                    str2 = str6;
                    image = image3;
                    aVar = aVar2;
                }
                cVarB.c(descriptor2);
                return new Header(i11, str, str2, image, aVar, (v1) null);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Header value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Header.h(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                ro0.d[] dVarArr = Header.f66803e;
                z1 z1Var = z1.f119730a;
                return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(Image.a.f50552a), so0.a.p(dVarArr[3])};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: g$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$f$b;", "", "<init>", "()V", "Lro0/d;", "Lg$f;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Header> serializer() {
                return a.f66808a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: g$f$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Header createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Header(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? defpackage.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Header[] newArray(int i11) {
                return new Header[i11];
            }
        }

        public Header() {
            this((String) null, (String) null, (Image) null, (defpackage.a) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Header c(Header header, String str, String str2, Image image, defpackage.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.title;
            }
            if ((i11 & 2) != 0) {
                str2 = header.subtitle;
            }
            if ((i11 & 4) != 0) {
                image = header.icon;
            }
            if ((i11 & 8) != 0) {
                aVar = header.alignment;
            }
            return header.b(str, str2, image, aVar);
        }

        public static final /* synthetic */ void h(Header self, uo0.d output, f serialDesc) {
            ro0.d<Object>[] dVarArr = f66803e;
            if (output.G(serialDesc, 0) || self.title != null) {
                output.y(serialDesc, 0, z1.f119730a, self.title);
            }
            if (output.G(serialDesc, 1) || self.subtitle != null) {
                output.y(serialDesc, 1, z1.f119730a, self.subtitle);
            }
            if (output.G(serialDesc, 2) || self.icon != null) {
                output.y(serialDesc, 2, Image.a.f50552a, self.icon);
            }
            if (!output.G(serialDesc, 3) && self.alignment == null) {
                return;
            }
            output.y(serialDesc, 3, dVarArr[3], self.alignment);
        }

        public final Header b(String title, String subtitle, Image icon, defpackage.a alignment) {
            return new Header(title, subtitle, icon, alignment);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final defpackage.a getAlignment() {
            return this.alignment;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Image getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return s.f(this.title, header.title) && s.f(this.subtitle, header.subtitle) && s.f(this.icon, header.icon) && this.alignment == header.alignment;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.icon;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            defpackage.a aVar = this.alignment;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Header(title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Image image = this.icon;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                image.writeToParcel(parcel, flags);
            }
            defpackage.a aVar = this.alignment;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(aVar.name());
            }
        }

        @e
        public /* synthetic */ Header(int i11, String str, String str2, Image image, defpackage.a aVar, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i11 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            if ((i11 & 4) == 0) {
                this.icon = null;
            } else {
                this.icon = image;
            }
            if ((i11 & 8) == 0) {
                this.alignment = null;
            } else {
                this.alignment = aVar;
            }
        }

        public Header(String str, String str2, Image image, defpackage.a aVar) {
            this.title = str;
            this.subtitle = str2;
            this.icon = image;
            this.alignment = aVar;
        }

        public /* synthetic */ Header(String str, String str2, Image image, defpackage.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : image, (i11 & 8) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: g$g, reason: collision with other inner class name and from toString */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002$\u0013B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lg$g;", "Landroid/os/Parcelable;", "", "fullWidthContent", "Ln;", "verticalAlignment", "<init>", "(Ljava/lang/Boolean;Ln;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ln;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lg$g;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Boolean;", "getFullWidthContent", "()Ljava/lang/Boolean;", "getFullWidthContent$annotations", "()V", "Ln;", "getVerticalAlignment", "()Ln;", "getVerticalAlignment$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Options implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean fullWidthContent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n verticalAlignment;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Options> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d<Object>[] f66809c = {null, n.INSTANCE.serializer()};

        /* JADX INFO: renamed from: g$g$a */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"FinancialConnectionsGenericInfoScreen.Options.$serializer", "Lvo0/e0;", "Lg$g;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg$g;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg$g;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Options> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66812a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f66812a = aVar;
                m1 m1Var = new m1("FinancialConnectionsGenericInfoScreen.Options", aVar, 2);
                m1Var.o("full_width_content", true);
                m1Var.o("vertical_alignment", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Options deserialize(uo0.e decoder) {
                n nVar;
                Boolean bool;
                int i11;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                ro0.d[] dVarArr = Options.f66809c;
                v1 v1Var = null;
                if (cVarB.i()) {
                    bool = (Boolean) cVarB.v(descriptor2, 0, h.f119620a, null);
                    nVar = (n) cVarB.v(descriptor2, 1, dVarArr[1], null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    n nVar2 = null;
                    Boolean bool2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            bool2 = (Boolean) cVarB.v(descriptor2, 0, h.f119620a, bool2);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            nVar2 = (n) cVarB.v(descriptor2, 1, dVarArr[1], nVar2);
                            i12 |= 2;
                        }
                    }
                    nVar = nVar2;
                    bool = bool2;
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new Options(i11, bool, nVar, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Options value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Options.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{so0.a.p(h.f119620a), so0.a.p(Options.f66809c[1])};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: g$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg$g$b;", "", "<init>", "()V", "Lro0/d;", "Lg$g;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Options> serializer() {
                return a.f66812a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: g$g$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Options> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Options createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                s.k(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Options(boolValueOf, parcel.readInt() != 0 ? n.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Options[] newArray(int i11) {
                return new Options[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Options() {
            this((Boolean) null, (n) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ void b(Options self, uo0.d output, f serialDesc) {
            ro0.d<Object>[] dVarArr = f66809c;
            if (output.G(serialDesc, 0) || self.fullWidthContent != null) {
                output.y(serialDesc, 0, h.f119620a, self.fullWidthContent);
            }
            if (!output.G(serialDesc, 1) && self.verticalAlignment == null) {
                return;
            }
            output.y(serialDesc, 1, dVarArr[1], self.verticalAlignment);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return s.f(this.fullWidthContent, options.fullWidthContent) && this.verticalAlignment == options.verticalAlignment;
        }

        public int hashCode() {
            Boolean bool = this.fullWidthContent;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            n nVar = this.verticalAlignment;
            return iHashCode + (nVar != null ? nVar.hashCode() : 0);
        }

        public String toString() {
            return "Options(fullWidthContent=" + this.fullWidthContent + ", verticalAlignment=" + this.verticalAlignment + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            Boolean bool = this.fullWidthContent;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            n nVar = this.verticalAlignment;
            if (nVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(nVar.name());
            }
        }

        @e
        public /* synthetic */ Options(int i11, @o("full_width_content") Boolean bool, @o("vertical_alignment") n nVar, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.fullWidthContent = null;
            } else {
                this.fullWidthContent = bool;
            }
            if ((i11 & 2) == 0) {
                this.verticalAlignment = null;
            } else {
                this.verticalAlignment = nVar;
            }
        }

        public Options(Boolean bool, n nVar) {
            this.fullWidthContent = bool;
            this.verticalAlignment = nVar;
        }

        public /* synthetic */ Options(Boolean bool, n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : nVar);
        }
    }

    @e
    public /* synthetic */ FinancialConnectionsGenericInfoScreen(int i11, String str, Header header, Body body, Footer footer, Options options, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f66767a.getDescriptor());
        }
        this.id = str;
        if ((i11 & 2) == 0) {
            this.header = null;
        } else {
            this.header = header;
        }
        if ((i11 & 4) == 0) {
            this.body = null;
        } else {
            this.body = body;
        }
        if ((i11 & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footer;
        }
        if ((i11 & 16) == 0) {
            this.options = null;
        } else {
            this.options = options;
        }
    }

    public static /* synthetic */ FinancialConnectionsGenericInfoScreen b(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, String str, Header header, Body body, Footer footer, Options options, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financialConnectionsGenericInfoScreen.id;
        }
        if ((i11 & 2) != 0) {
            header = financialConnectionsGenericInfoScreen.header;
        }
        if ((i11 & 4) != 0) {
            body = financialConnectionsGenericInfoScreen.body;
        }
        if ((i11 & 8) != 0) {
            footer = financialConnectionsGenericInfoScreen.footer;
        }
        if ((i11 & 16) != 0) {
            options = financialConnectionsGenericInfoScreen.options;
        }
        Options options2 = options;
        Body body2 = body;
        return financialConnectionsGenericInfoScreen.a(str, header, body2, footer, options2);
    }

    public static final /* synthetic */ void f(FinancialConnectionsGenericInfoScreen self, uo0.d output, f serialDesc) {
        output.e(serialDesc, 0, self.id);
        if (output.G(serialDesc, 1) || self.header != null) {
            output.y(serialDesc, 1, Header.a.f66808a, self.header);
        }
        if (output.G(serialDesc, 2) || self.body != null) {
            output.y(serialDesc, 2, Body.a.f66771a, self.body);
        }
        if (output.G(serialDesc, 3) || self.footer != null) {
            output.y(serialDesc, 3, Footer.a.f66798a, self.footer);
        }
        if (!output.G(serialDesc, 4) && self.options == null) {
            return;
        }
        output.y(serialDesc, 4, Options.a.f66812a, self.options);
    }

    public final FinancialConnectionsGenericInfoScreen a(String id2, Header header, Body body, Footer footer, Options options) {
        s.k(id2, "id");
        return new FinancialConnectionsGenericInfoScreen(id2, header, body, footer, options);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsGenericInfoScreen)) {
            return false;
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) other;
        return s.f(this.id, financialConnectionsGenericInfoScreen.id) && s.f(this.header, financialConnectionsGenericInfoScreen.header) && s.f(this.body, financialConnectionsGenericInfoScreen.body) && s.f(this.footer, financialConnectionsGenericInfoScreen.footer) && s.f(this.options, financialConnectionsGenericInfoScreen.options);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        Body body = this.body;
        int iHashCode3 = (iHashCode2 + (body == null ? 0 : body.hashCode())) * 31;
        Footer footer = this.footer;
        int iHashCode4 = (iHashCode3 + (footer == null ? 0 : footer.hashCode())) * 31;
        Options options = this.options;
        return iHashCode4 + (options != null ? options.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsGenericInfoScreen(id=" + this.id + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        Header header = this.header;
        if (header == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            header.writeToParcel(parcel, flags);
        }
        Body body = this.body;
        if (body == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            body.writeToParcel(parcel, flags);
        }
        Footer footer = this.footer;
        if (footer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footer.writeToParcel(parcel, flags);
        }
        Options options = this.options;
        if (options == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            options.writeToParcel(parcel, flags);
        }
    }

    public FinancialConnectionsGenericInfoScreen(String id2, Header header, Body body, Footer footer, Options options) {
        s.k(id2, "id");
        this.id = id2;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.options = options;
    }
}
