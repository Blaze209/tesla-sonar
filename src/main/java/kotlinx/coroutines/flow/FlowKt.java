package kotlinx.coroutines.flow;

import bo0.j;
import bo0.m;
import ho0.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import p013kotlin.Metadata;
import p013kotlin.collections.IndexedValue;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.s;
import wn0.t;
import wn0.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__LogicKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Object all(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        return FlowKt__LogicKt.all(flow, pVar, continuation);
    }

    public static final <T> Object any(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        return FlowKt__LogicKt.any(flow, pVar, continuation);
    }

    public static final Flow<Integer> asFlow(j jVar) {
        return FlowKt__BuildersKt.asFlow(jVar);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    @jn0.e
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.callbackFlow(pVar);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m548catch(Flow<? extends T> flow, q<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.m559catch(flow, qVar);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, Continuation<? super Throwable> continuation) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, continuation);
    }

    public static final <T> Flow<T> channelFlow(p<? super ProducerScope<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.channelFlow(pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i11) {
        return FlowKt__TransformKt.chunked(flow, i11);
    }

    public static final Object collect(Flow<?> flow, Continuation<? super h0> continuation) {
        return FlowKt__CollectKt.collect(flow, continuation);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, q<? super Integer, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super h0> continuation) {
        return FlowKt__CollectKt.collectIndexed(flow, qVar, continuation);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        return FlowKt__CollectKt.collectLatest(flow, pVar, continuation);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        return FlowKt__LimitKt.collectWhile(flow, pVar, continuation);
    }

    @jn0.e
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @jn0.e
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, l<? super Flow<? extends T>, ? extends Flow<? extends R>> lVar) {
        return FlowKt__MigrationKt.compose(flow, lVar);
    }

    @jn0.e
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, l<? super T, ? extends Flow<? extends R>> lVar) {
        return FlowKt__MigrationKt.concatMap(flow, lVar);
    }

    @jn0.e
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t11) {
        return FlowKt__MigrationKt.concatWith(flow, t11);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.count(flow, continuation);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j11) {
        return FlowKt__DelayKt.debounce(flow, j11);
    }

    @FlowPreview
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m549debounceHG0u8IE(Flow<? extends T> flow, long j11) {
        return FlowKt__DelayKt.m552debounceHG0u8IE(flow, j11);
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, l<? super T, io0.b> lVar) {
        return FlowKt__DelayKt.debounceDuration(flow, lVar);
    }

    @jn0.e
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j11) {
        return FlowKt__MigrationKt.delayEach(flow, j11);
    }

    @jn0.e
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j11) {
        return FlowKt__MigrationKt.delayFlow(flow, j11);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, l<? super T, ? extends K> lVar) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, lVar);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i11) {
        return FlowKt__LimitKt.drop(flow, i11);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.dropWhile(flow, pVar);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super h0> continuation) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, continuation);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.filter(flow, pVar);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.filterNot(flow, pVar);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.first(flow, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, continuation);
    }

    public static final ReceiveChannel<h0> fixedPeriodTicker(CoroutineScope coroutineScope, long j11) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j11);
    }

    @jn0.e
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.flatMap(flow, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.flatMapConcat(flow, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.flatMapLatest(flow, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i11, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.flatMapMerge(flow, i11, pVar);
    }

    @jn0.e
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i11) {
        return FlowKt__MergeKt.flattenMerge(flow, i11);
    }

    public static final <T> Flow<T> flow(p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.flow(pVar);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, qVar);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super h0>, ? extends Object> rVar) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, rVar);
    }

    public static final <T> Flow<T> flowOf(T t11) {
        return FlowKt__BuildersKt.flowOf(t11);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__ContextKt.flowOn(flow, coroutineContext);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation) {
        return FlowKt__ReduceKt.fold(flow, r11, qVar, continuation);
    }

    @jn0.e
    public static final <T> void forEach(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
        FlowKt__MigrationKt.forEach(flow, pVar);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.last(flow, continuation);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.lastOrNull(flow, continuation);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.map(flow, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.mapLatest(flow, pVar);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.mapNotNull(flow, pVar);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> Object none(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        return FlowKt__LogicKt.none(flow, pVar, continuation);
    }

    @jn0.e
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.observeOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, q<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.onCompletion(flow, qVar);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__TransformKt.onEach(flow, pVar);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.onEmpty(flow, pVar);
    }

    @jn0.e
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    @jn0.e
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    @jn0.e
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t11) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t11);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.onStart(flow, pVar);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, pVar);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    @jn0.e
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    @jn0.e
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.publishOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, q<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> qVar, Continuation<? super S> continuation) {
        return FlowKt__ReduceKt.reduce(flow, qVar, continuation);
    }

    @jn0.e
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j11, p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__ErrorsKt.retry(flow, j11, pVar);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, r<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> rVar) {
        return FlowKt__ErrorsKt.retryWhen(flow, rVar);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.runningFold(flow, r11, qVar);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return FlowKt__TransformKt.runningReduce(flow, qVar);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j11) {
        return FlowKt__DelayKt.sample(flow, j11);
    }

    @FlowPreview
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m550sampleHG0u8IE(Flow<? extends T> flow, long j11) {
        return FlowKt__DelayKt.m553sampleHG0u8IE(flow, j11);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.scan(flow, r11, qVar);
    }

    @jn0.e
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.scanFold(flow, r11, qVar);
    }

    @jn0.e
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.scanReduce(flow, qVar);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i11) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i11);
    }

    public static final <T> Object single(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.single(flow, continuation);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.singleOrNull(flow, continuation);
    }

    @jn0.e
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i11) {
        return FlowKt__MigrationKt.skip(flow, i11);
    }

    @jn0.e
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t11) {
        return FlowKt__MigrationKt.startWith(flow, t11);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, Continuation<? super StateFlow<? extends T>> continuation) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, continuation);
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    @jn0.e
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.subscribeOn(flow, coroutineContext);
    }

    @jn0.e
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.switchMap(flow, pVar);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i11) {
        return FlowKt__LimitKt.take(flow, i11);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.takeWhile(flow, pVar);
    }

    @FlowPreview
    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m551timeoutHG0u8IE(Flow<? extends T> flow, long j11) {
        return FlowKt__DelayKt.m554timeoutHG0u8IE(flow, j11);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c11, Continuation<? super C> continuation) {
        return FlowKt__CollectionKt.toCollection(flow, c11, continuation);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, Continuation<? super List<? extends T>> continuation) {
        return FlowKt__CollectionKt.toList(flow, list, continuation);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, Continuation<? super Set<? extends T>> continuation) {
        return FlowKt__CollectionKt.toSet(flow, set, continuation);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.transform(flow, qVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt__MergeKt.transformLatest(flow, qVar);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.transformWhile(flow, qVar);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.unsafeTransform(flow, qVar);
    }

    public static final <T> Flow<IndexedValue<T>> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.zip(flow, flow2, qVar);
    }

    public static final Flow<Long> asFlow(m mVar) {
        return FlowKt__BuildersKt.asFlow(mVar);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i11, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i11, bufferOverflow);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @jn0.e
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, sVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, u<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super h0>, ? extends Object> uVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, uVar);
    }

    @jn0.e
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object count(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.count(flow, pVar, continuation);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, l<? super T, Long> lVar) {
        return FlowKt__DelayKt.debounce(flow, lVar);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, p<? super T, ? super T, Boolean> pVar) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, pVar);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super h0> continuation) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, continuation);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, co0.d<R> dVar) {
        return FlowKt__TransformKt.filterIsInstance(flow, dVar);
    }

    public static final <T> Object first(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.first(flow, pVar, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, pVar, continuation);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    @jn0.e
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    @jn0.e
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t11, l<? super Throwable, Boolean> lVar) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t11, lVar);
    }

    @jn0.e
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i11) {
        return FlowKt__MigrationKt.publish(flow, i11);
    }

    @jn0.e
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i11) {
        return FlowKt__MigrationKt.replay(flow, i11);
    }

    @jn0.e
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t11) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t11);
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
        FlowKt__MigrationKt.subscribe(flow, pVar);
    }

    public static final <T> Flow<T> asFlow(i<? extends T> iVar) {
        return FlowKt__BuildersKt.asFlow(iVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    @jn0.e
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, rVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super h0>, ? extends Object> tVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, tVar);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2) {
        FlowKt__MigrationKt.subscribe(flow, pVar, pVar2);
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, rVar);
    }

    @jn0.e
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, qVar);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super h0>, ? extends Object> sVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, sVar);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.combine(flow, flow2, qVar);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super h0>, ? extends Object> rVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, rVar);
    }

    public static final <T> Flow<T> asFlow(wn0.a<? extends T> aVar) {
        return FlowKt__BuildersKt.asFlow(aVar);
    }

    public static final <T> Flow<T> asFlow(l<? super Continuation<? super T>, ? extends Object> lVar) {
        return FlowKt__BuildersKt.asFlow(lVar);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
