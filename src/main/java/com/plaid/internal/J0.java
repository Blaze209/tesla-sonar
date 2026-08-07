package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class J0 implements Parcelable {
    public static final Parcelable.Creator<J0> CREATOR = new b();

    @jn0.e
    public static final class a implements vo0.e0<J0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46366b;

        static {
            a aVar = new a();
            f46365a = aVar;
            f46366b = new vo0.m1("com.plaid.internal.models.EmbeddedOpenLinkActionLinkWithAccountNumbers", aVar, 0);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[0];
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            int iA;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46366b;
            uo0.c cVarB = decoder.b(m1Var);
            if (!cVarB.i() && (iA = cVarB.A(m1Var)) != -1) {
                throw new UnknownFieldException(iA);
            }
            cVarB.c(m1Var);
            return new J0(0);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46366b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            J0 value = (J0) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46366b;
            encoder.b(m1Var).c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<J0> {
        @Override // android.os.Parcelable.Creator
        public final J0 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            parcel.readInt();
            return new J0();
        }

        @Override // android.os.Parcelable.Creator
        public final J0[] newArray(int i11) {
            return new J0[i11];
        }
    }

    public J0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeInt(1);
    }

    @jn0.e
    public J0(int i11) {
    }
}
