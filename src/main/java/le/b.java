package le;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/Channel;", "a", "()Lkotlinx/coroutines/channels/Channel;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final <T> Channel<T> a() {
        return ChannelKt.Channel$default(-2, null, null, 6, null);
    }
}
