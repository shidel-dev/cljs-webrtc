(ns cljs-webrtc.core)

(enable-console-print!)

(def peer-connection  (or js/window.mozRTCPeerConnection js/window.webkitRTCPeerConnection))

(def ice-candidate (or js/window.mozRTCIceCandidate js/window.RTCIceCandidate))

(def session-description (or js/window.mozRTCSessionDescription  js/window.RTCSessionDescription))

(set! (.-getUserMedia js/navigator) (or js/navigator.getUserMedia js/navigator.mozGetUserMedia || navigator.webkitGetUserMedia))


