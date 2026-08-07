package ti;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lti/c;", "", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/k;", "data", "Ljn0/h0;", "send", "(Lokio/k;)V", InquiryField.StringField.TYPE, "(Ljava/lang/String;)V", "close", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface c {
    void close();

    Object receive(Continuation<? super String> continuation);

    void send(String string);

    void send(k data);
}
