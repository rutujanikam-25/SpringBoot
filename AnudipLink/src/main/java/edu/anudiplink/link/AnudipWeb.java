package edu.anudiplink.link;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnudipWeb {
	@RequestMapping(value = "/Anudip", method = RequestMethod.GET)
	// (method = RequestMethod.GET) This process GET is default
	public String demo1() {
		return "<body bgcolor='White' text='Black'><center><h1>Anudip Foundation</h1><h2> <a href=\"https:aln.anudip.org\">aln.anudip.org</a> </h2></center></body>";
	}
}
