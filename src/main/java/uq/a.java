package uq;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes4.dex */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput);
}
