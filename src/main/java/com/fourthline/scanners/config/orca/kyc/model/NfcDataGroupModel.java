package com.fourthline.scanners.config.orca.kyc.model;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel;", "", "", "groupNumber", "", "data", "<init>", "(ILjava/lang/String;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGroupNumber", "setGroupNumber", "(I)V", "getGroupNumber$annotations", "()V", "Ljava/lang/String;", "getData", "setData", "(Ljava/lang/String;)V", "getData$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class NfcDataGroupModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String data;
    private int groupNumber;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/NfcDataGroupModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<NfcDataGroupModel> serializer() {
            return NfcDataGroupModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ NfcDataGroupModel(int i11, int i12, String str, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, NfcDataGroupModel$$serializer.INSTANCE.getDescriptor());
        }
        this.groupNumber = i12;
        this.data = str;
    }

    public static /* synthetic */ NfcDataGroupModel copy$default(NfcDataGroupModel nfcDataGroupModel, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = nfcDataGroupModel.groupNumber;
        }
        if ((i12 & 2) != 0) {
            str = nfcDataGroupModel.data;
        }
        return nfcDataGroupModel.copy(i11, str);
    }

    @o("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @o("groupNumber")
    public static /* synthetic */ void getGroupNumber$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(NfcDataGroupModel self, uo0.d output, f serialDesc) {
        output.x(serialDesc, 0, self.groupNumber);
        output.e(serialDesc, 1, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGroupNumber() {
        return this.groupNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final NfcDataGroupModel copy(int groupNumber, String data) {
        s.k(data, "data");
        return new NfcDataGroupModel(groupNumber, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcDataGroupModel)) {
            return false;
        }
        NfcDataGroupModel nfcDataGroupModel = (NfcDataGroupModel) other;
        return this.groupNumber == nfcDataGroupModel.groupNumber && s.f(this.data, nfcDataGroupModel.data);
    }

    public final String getData() {
        return this.data;
    }

    public final int getGroupNumber() {
        return this.groupNumber;
    }

    public int hashCode() {
        return (Integer.hashCode(this.groupNumber) * 31) + this.data.hashCode();
    }

    public final void setData(String str) {
        s.k(str, "<set-?>");
        this.data = str;
    }

    public final void setGroupNumber(int i11) {
        this.groupNumber = i11;
    }

    public String toString() {
        return "NfcDataGroupModel(groupNumber=" + this.groupNumber + ", data=" + this.data + ")";
    }

    public NfcDataGroupModel(int i11, String data) {
        s.k(data, "data");
        this.groupNumber = i11;
        this.data = data;
    }
}
