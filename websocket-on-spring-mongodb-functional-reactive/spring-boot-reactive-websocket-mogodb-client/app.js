var ws = null;
var url = "ws://localhost:8080/subscribe";
 
function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
	document.getElementById('email').disabled = !connected;
    document.getElementById('subscribe').disabled = !connected;
}
 
function connect() {
    ws = new WebSocket(url);
    ws.onopen = function() {
        setConnected(true);
        document.getElementById('msg').innerHTML = '<span style="color:green; font-weight: bolder; margin-top: 5px;">Connected to server</span>';
    };
     
    ws.onmessage = function(event) {
		document.getElementById('msg').innerHTML = '<span style="color:green; font-weight: bolder; margin-top: 5px;">Successfully subscribed => ' + event.data + '</span>';
    };
     
    ws.onclose = function(event) {
        setConnected(false);
        document.getElementById('msg').innerHTML = '<span style="color:red; font-weight: bolder; margin-top: 5px;">Disconnected from server</span>';
    };
}
 
function disconnect() {
    if (ws != null) {
        ws.close();
        ws = null;
    }
    setConnected(false);
}
 
function subscribe() {
    if (ws != null) {
        var email = document.getElementById('email').value;
        ws.send(email);
    } else {
        document.getElementById('msg').innerHTML = '<span style="color:red; font-weight: bolder; margin-top: 5px;">Not connected to server, please connect</span>';
    }
}