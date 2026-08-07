package com.teslamotors.plugins.ble;

import android.os.Message;
import androidx.annotation.NonNull;
import df0.ToVCSECMessageResult;
import ef0.VehicleMessage;
import vc0.e3;
import vc0.v2;

/* JADX INFO: loaded from: classes8.dex */
public interface g0 {
    void A();

    void B(hf0.f fVar, ic0.f fVar2);

    void C();

    boolean D();

    void E(String str);

    void F(Peripheral peripheral);

    hf0.d a(byte[] bArr, byte[] bArr2);

    void b(Peripheral peripheral);

    void c(Peripheral peripheral);

    void d();

    void destroy();

    void disconnect();

    void e(Peripheral peripheral, int i11);

    void f();

    void g();

    hf0.i h();

    void i(boolean z11);

    void j(Peripheral peripheral);

    ToVCSECMessageResult k(e3 e3Var, v2 v2Var, byte[] bArr);

    void l(Peripheral peripheral, String str);

    boolean m();

    boolean n();

    void o(byte[] bArr);

    void p(String str, @NonNull Throwable th2);

    String q();

    boolean r();

    void s();

    void t();

    void u(Message message);

    ic0.h v(@NonNull String str, byte[] bArr);

    void w(hf0.m mVar, boolean z11);

    void x(boolean z11, String str, String str2, Peripheral peripheral);

    void y(VehicleMessage vehicleMessage, Peripheral peripheral);

    df0.c z();
}
