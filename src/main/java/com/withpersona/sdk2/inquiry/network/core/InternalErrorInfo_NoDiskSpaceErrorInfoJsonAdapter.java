package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import java.lang.reflect.Constructor;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends h<InternalErrorInfo.NoDiskSpaceErrorInfo> {
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;
    private final k.b options = k.b.a("message");
    private final h<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "message");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("InternalErrorInfo.NoDiskSpaceErrorInfo");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(k kVar) throws NoSuchMethodException {
        kVar.h();
        String strFromJson = null;
        int i11 = -1;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.stringAdapter.fromJson(kVar);
                if (strFromJson == null) {
                    throw v20.c.x("message", "message", kVar);
                }
                i11 = -2;
            } else {
                continue;
            }
        }
        kVar.j();
        if (i11 == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(strFromJson);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, v20.c.f117643c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, Integer.valueOf(i11), null);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("message");
        this.stringAdapter.toJson(rVar, noDiskSpaceErrorInfo.getMessage());
        rVar.C();
    }
}
