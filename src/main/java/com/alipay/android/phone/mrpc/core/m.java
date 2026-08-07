package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
class m extends FutureTask<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f20014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f20015b = lVar;
        this.f20014a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        String msg;
        int code;
        o oVarE = this.f20014a.e();
        ae aeVarF = oVarE.f();
        if (aeVarF == null) {
            super.done();
            return;
        }
        try {
            v vVar = get();
            if (!isCancelled() && !oVarE.h()) {
                if (vVar != null) {
                    aeVarF.a(oVarE, vVar);
                    return;
                }
                return;
            }
            oVarE.g();
            if (!isCancelled() || !isDone()) {
                cancel(false);
            }
            aeVarF.a(oVarE);
        } catch (InterruptedException e11) {
            aeVarF.a(oVarE, 7, e11 + "");
        } catch (CancellationException unused) {
            oVarE.g();
            aeVarF.a(oVarE);
        } catch (ExecutionException e12) {
            if (e12.getCause() == null || !(e12.getCause() instanceof HttpException)) {
                msg = e12 + "";
                code = 6;
            } else {
                HttpException httpException = (HttpException) e12.getCause();
                code = httpException.getCode();
                msg = httpException.getMsg();
            }
            aeVarF.a(oVarE, code, msg);
        } catch (Throwable th2) {
            throw new RuntimeException("An error occured while executing http request", th2);
        }
    }
}
