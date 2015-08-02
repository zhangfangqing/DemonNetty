package netty.common.connection;

import java.net.SocketAddress;

import netty.common.message.DemonMessage;
import netty.common.message.DemonRequest;
import netty.common.message.DemonResponse;
import netty.common.stack.DemonStackConfiguration;
import netty.common.tracer.DemonTracer;
import netty.common.transaction.DemonTransaction;
import netty.common.transaction.DemonTransactionCreateEvent;
import netty.common.transaction.DemonTransactionManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

public class DefaultDemonDedicateConnection extends ChannelInitializer<SocketChannel>
		implements DemonDedicateConnection,DemonDedicateConnectionProcessor {
	
	private static DemonTracer _tracer=DemonTracer.getInstance(DefaultDemonDedicateConnection.class);
	
	private String _key;
	
	private DemonStackConfiguration _config;
	
	private DemonTransactionManager _transMgr;
	
	private DemonDedicateConnectionEvent _connEvent;
	
	private DemonTransactionCreateEvent _createEvent;
	
	private NioEventLoopGroup _group;
	
	private Channel _channel;

	public DefaultDemonDedicateConnection(String key,
			DemonStackConfiguration config, NioEventLoopGroup group) {
		_key=key;
		_config=config;
		_group=group;
		_transMgr=new DemonTransactionManager(this);
	}

	@Override
	protected void initChannel(SocketChannel arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDemonConnectionEvent(DemonDedicateConnectionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerDemonTransactionCreated(
			DemonTransactionCreateEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect(String ip, int port) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect(SocketAddress address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect(SocketAddress address, Object attachment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect(Object attachment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DemonTransaction createTransaction(DemonRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DemonTransaction createTransaction(DemonRequest req, int timeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processSendMessage(DemonMessage msg, DemonTransaction trans) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processReceiveRequest(DemonRequest req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processReceiveResponse(DemonResponse resp) {
		// TODO Auto-generated method stub
		
	}

}
