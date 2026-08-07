package uq;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i11, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult tresultApply;
        if (i11 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i11--;
        } while (i11 >= 1);
        return tresultApply;
    }
}
