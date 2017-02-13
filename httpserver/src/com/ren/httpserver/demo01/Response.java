package com.ren.httpserver.demo01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class Response {

	private final String CRLF = "\r\n";
	private final String BLANK = " ";

	private BufferedWriter bw;

	private StringBuilder content;

	private StringBuilder headInfo;
	private int len;

	public Response() {
		headInfo = new StringBuilder();
		content = new StringBuilder();
		len = 0;
	}

	public Response(OutputStream os) {
		this();
		bw = new BufferedWriter(new OutputStreamWriter(os));
	}

	public Response(Socket server) throws IOException {
		this(server.getOutputStream());
	}

	public Response print(String info) {
		content.append(info);
		len += info.getBytes().length;
		return this;
	}

	public Response println(String info) {
		content.append(info).append(CRLF);
		len += (info + CRLF).getBytes().length;
		return this;
	}

	/**
	 * 创建头信息
	 * @param code
	 */
	private void createHeadInfo(int code) {
		headInfo.append("HTTP/1.1").append(BLANK).append(code).append(BLANK);
		switch (code) {
		case 200:
			headInfo.append("OK");
			break;
		case 404:
			headInfo.append("NOT FOUND");
			break;
		case 505:
			headInfo.append("SERVER ERROR");
			break;
		}
		headInfo.append(CRLF);
		headInfo.append("Servser:Ren Server/0.0.1").append(CRLF);
		headInfo.append("Date:").append(new Date()).append(CRLF);
		headInfo.append("Content-type:text/html;charset=UTF-8").append(CRLF);
		headInfo.append("Content-Length:").append(len).append(CRLF);
		headInfo.append(CRLF);
	}

	void pushToClient(int code) throws IOException {
		createHeadInfo(code);
		bw.append(headInfo.toString());
		bw.append(content.toString());
		bw.flush();
	}

	public void close() throws IOException {
		bw.close();
	}

}
