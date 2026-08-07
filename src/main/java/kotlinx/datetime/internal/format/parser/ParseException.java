package kotlinx.datetime.internal.format.parser;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import po0.i;
import po0.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lpo0/i;", "errors", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(List<i> errors) {
        super(m.e(errors));
        s.k(errors, "errors");
    }
}
