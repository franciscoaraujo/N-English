package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Pronunciations;
import com.squareup.okhttp.Response;

@Service
public class LinguaRobotService {

	@Value("${url.lingua.roboot}")
	private String url;

	@Value("${access.lingua.robot.host}")
	private String host;

	@Value("${access.lingua.robot.key}")
	private String key;

	@Autowired
	private Connection conn;

	public Pronunciations request(String uri) throws JsonSyntaxException, IOException {
		Response response = conn.connection(url + uri, host, key);
		String obj = response.body().string();
		String strObj = (String) obj.substring(obj.indexOf("audio"), obj.indexOf("license"));
		String uriAudio = strObj.substring(strObj.indexOf("http")).replace("\",\"", "");
		Pronunciations linguaRobot = new Pronunciations();
		linguaRobot.setUrlAudio(uriAudio);
		return linguaRobot;
	}

	// [{"entry":"root","pronunciations":[{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-au.mp3","license":{"name":"BY-SA
	// 4.0","url":"https://creativecommons.org/licenses/by-sa/4.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=75649427"},"context":{"regions":["Australia"]}},{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-us.mp3","license":{"name":"BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=694365"},"context":{"regions":["United
	// States"]}}],"interpretations":[{"lemma":"root","homographNumber":1,"normalizedLemmas":[{"lemma":"root","homographNumber":1}],"partOfSpeech":"noun","grammar":[{"number":["singular"],"case":["nominative"]}]},{"lemma":"root","homographNumber":1,"normalizedLemmas":[{"lemma":"root","homographNumber":1}],"partOfSpeech":"verb","grammar":[{"verbForm":["infinitive"]},{"person":["first-person","second-person","third-person"],"number":["plural"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"mood":["imperative"]},{"person":["first-person","second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["present"],"mood":["subjunctive"]}]}],"lexemes":[{"lemma":"root","homographNumber":1,"partOfSpeech":"noun","senses":[{"definition":"The
	// part of a plant, generally underground, that anchors and supports the plant
	// body, absorbs and stores water and nutrients, and in some plants is able to
	// perform vegetative
	// reproduction.","labels":["countable","uncountable"],"usageExamples":["This
	// tree's roots can go as deep as twenty metres underground."]},{"definition":"A
	// root vegetable.","labels":["countable","uncountable"]},{"definition":"The
	// part of a tooth extending into the bone holding the tooth in
	// place.","labels":["countable","uncountable"],"usageExamples":["Root damage is
	// a common problem of overbrushing."]},{"definition":"The part of a hair under
	// the skin that holds the hair in
	// place.","labels":["countable","uncountable"],"usageExamples":["The root is
	// the only part of the hair that is alive."]},{"definition":"The part of a hair
	// near the skin that has not been dyed, permed, or otherwise
	// treated.","labels":["countable","uncountable"],"usageExamples":["He dyed his
	// hair black last month, so the grey roots can be seen."]},{"definition":"The
	// primary source;
	// origin.","labels":["countable","uncountable"],"usageExamples":["The love of
	// money is the root of all evil."]},{"definition":"Of a number or expression, a
	// number which, when raised to a specified power, yields the specified number
	// or
	// expression.","labels":["countable","uncountable"],"context":{"domains":["mathematics"]},"usageExamples":["The
	// cube root of 27 is 3."]},{"definition":"A square root (understood if no power
	// is specified; in which case, “the root of” is often abbreviated to
	// “root”).","labels":["countable","uncountable"],"context":{"domains":["mathematics"]},"usageExamples":["Multiply
	// by root 2."]},{"definition":"A zero (of an
	// equation).","labels":["countable","uncountable"],"context":{"domains":["mathematics"]}},{"definition":"The
	// single node of a tree that has no
	// parent.","labels":["countable","uncountable"],"context":{"domains":["computing","mathematics"]}},{"definition":"The
	// primary lexical unit of a word, which carries the most significant aspects of
	// semantic content and cannot be reduced into smaller constituents.
	// Inflectional stems often derive from
	// roots.","labels":["countable","uncountable"],"context":{"domains":["linguistics"]}},{"definition":"(philology)
	// A word from which another word or words are
	// derived.","labels":["countable","uncountable"]},{"definition":"The
	// fundamental tone of any chord; the tone from whose harmonics, or overtones, a
	// chord is
	// composed.","labels":["countable","uncountable"],"context":{"domains":["music"]}},{"definition":"The
	// lowest place, position, or
	// part.","labels":["countable","uncountable"]},{"definition":"In UNIX
	// terminology, the first user account with complete access to the operating
	// system and its configuration, found at the root of the directory structure;
	// the person who manages accounts on a UNIX
	// system.","labels":["countable","uncountable"],"context":{"domains":["computing"]},"usageExamples":["I
	// have to log in as root before I do that."]},{"definition":"The highest
	// directory of a directory structure which may contain both files and
	// subdirectories.","labels":["countable","uncountable"],"context":{"domains":["computing"]},"usageExamples":["I
	// installed the files in the root directory."]},{"definition":"A penis,
	// especially the base of a
	// penis.","labels":["countable","slang","uncountable"]}],"forms":[{"form":"roots","grammar":[{"number":["plural"],"case":["nominative"]}]}],"synonymSets":[{"sense":"source","synonyms":["source","origin","basis"]},{"sense":"zero
	// of an equation","synonyms":["zero"]},{"sense":"word from which another is
	// derived","synonyms":["etymon"]},{"sense":"Unix or Unix-like computer
	// operating system administrator and/or account","synonyms":["root
	// account","root user","superuser"]}],"antonymSets":[{"sense":"zero of an
	// equation","antonyms":["pole"]}]},{"lemma":"root","homographNumber":1,"partOfSpeech":"verb","senses":[{"definition":"To
	// fix the root; to enter the earth, as roots; to take root and begin to
	// grow."},{"definition":"To be firmly fixed; to be
	// established."},{"definition":"To break into a computer system and obtain root
	// access.","labels":["slang","transitive"],"context":{"domains":["computing"]},"usageExamples":["We
	// rooted his box and planted a virus on
	// it."]}],"forms":[{"form":"rooted","grammar":[{"verbForm":["participle"],"tense":["past"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["past"],"mood":["indicative"]}]},{"form":"rooting","grammar":[{"verbForm":["gerund"]},{"verbForm":["participle"],"tense":["present"]}]},{"form":"rootest","grammar":[{"person":["second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]},{"form":"rooteth","grammar":[{"person":["third-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]}]}],"license":{"name":"CC
	// BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrls":["https://en.wiktionary.org/wiki/root"]},{"entry":"root","pronunciations":[{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-au.mp3","license":{"name":"BY-SA
	// 4.0","url":"https://creativecommons.org/licenses/by-sa/4.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=75649427"},"context":{"regions":["Australia"]}},{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-us.mp3","license":{"name":"BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=694365"},"context":{"regions":["United
	// States"]}}],"interpretations":[{"lemma":"root","homographNumber":2,"normalizedLemmas":[{"lemma":"root","homographNumber":2}],"partOfSpeech":"noun","grammar":[{"number":["singular"],"case":["nominative"]}]},{"lemma":"root","homographNumber":2,"normalizedLemmas":[{"lemma":"root","homographNumber":2}],"partOfSpeech":"verb","grammar":[{"verbForm":["infinitive"]},{"person":["first-person","second-person","third-person"],"number":["plural"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"mood":["imperative"]},{"person":["first-person","second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["present"],"mood":["subjunctive"]}]}],"lexemes":[{"lemma":"root","homographNumber":2,"partOfSpeech":"noun","senses":[{"definition":"An
	// act of sexual
	// intercourse.","labels":["countable","slang","vulgar"],"context":{"regions":["Australia","New
	// Zealand"]},"usageExamples":["Fancy a root?"]},{"definition":"A sexual
	// partner.","labels":["countable","slang","vulgar"],"context":{"regions":["Australia","New
	// Zealand"]}}],"forms":[{"form":"roots","grammar":[{"number":["plural"],"case":["nominative"]}]}],"synonymSets":[{"sense":"act
	// of sexual intercourse","synonyms":["screw","shag"]},{"sense":"sexual
	// partner","synonyms":["screw"]}]},{"lemma":"root","homographNumber":2,"partOfSpeech":"verb","senses":[{"definition":"To
	// turn up or dig with the
	// snout.","labels":["intransitive","transitive"],"usageExamples":["A pig roots
	// the earth for truffles."]},{"definition":"(by extension) To seek favour or
	// advancement by low arts or grovelling servility; to fawn."},{"definition":"To
	// rummage; to search as if by digging in
	// soil.","labels":["intransitive"],"usageExamples":["rooting about in a
	// junk-filled drawer"]},{"definition":"To root out; to
	// abolish.","labels":["transitive"]},{"definition":"To have sexual
	// intercourse.","labels":["slang","vulgar"],"context":{"regions":["Australia","Ireland","New
	// Zealand"]}},{"definition":"To grow
	// roots","labels":["intransitive"],"context":{"domains":["horticulture"]},"usageExamples":["The
	// cuttings are starting to root."]},{"definition":"To prepare, oversee, or
	// otherwise cause the rooting of
	// cuttings","labels":["transitive"],"context":{"domains":["horticulture"]},"usageExamples":["We
	// rooted some cuttings last
	// summer."]}],"forms":[{"form":"rooted","grammar":[{"verbForm":["participle"],"tense":["past"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["past"],"mood":["indicative"]}]},{"form":"rooting","grammar":[{"verbForm":["gerund"]},{"verbForm":["participle"],"tense":["present"]}]},{"form":"rootest","grammar":[{"person":["second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]},{"form":"rooteth","grammar":[{"person":["third-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]}],"synonymSets":[{"sense":"rummage","synonyms":["rummage","dig
	// out","root out"]},{"sense":"have sexual
	// intercourse","synonyms":["bang","screw","shag","drill"]}]}],"license":{"name":"CC
	// BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrls":["https://en.wiktionary.org/wiki/root"]},{"entry":"root","pronunciations":[{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-au.mp3","license":{"name":"BY-SA
	// 4.0","url":"https://creativecommons.org/licenses/by-sa/4.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=75649427"},"context":{"regions":["Australia"]}},{"transcriptions":[{"transcription":"/ɹuːt/","notation":"IPA"},{"transcription":"/ɹʊt/","notation":"IPA"}],"audio":{"url":"http://audio.linguarobot.io/en/root-us.mp3","license":{"name":"BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrl":"https://commons.wikimedia.org/w/index.php?curid=694365"},"context":{"regions":["United
	// States"]}}],"interpretations":[{"lemma":"root","homographNumber":3,"normalizedLemmas":[{"lemma":"root","homographNumber":3}],"partOfSpeech":"verb","grammar":[{"verbForm":["infinitive"]},{"person":["first-person","second-person","third-person"],"number":["plural"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"mood":["imperative"]},{"person":["first-person","second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["present"],"mood":["subjunctive"]}]}],"lexemes":[{"lemma":"root","homographNumber":3,"partOfSpeech":"verb","senses":[{"definition":"(with
	// \"for\" or \"on\") To cheer (on); to show support (for) and hope for the
	// success of. (See root
	// for.)","labels":["intransitive"],"context":{"regions":["United
	// States"]},"usageExamples":["I'm rooting for you, don't let me
	// down!"]}],"forms":[{"form":"rooted","grammar":[{"verbForm":["participle"],"tense":["past"]},{"person":["first-person","second-person","third-person"],"number":["singular","plural"],"verbForm":["finite"],"tense":["past"],"mood":["indicative"]}]},{"form":"rooting","grammar":[{"verbForm":["gerund"]},{"verbForm":["participle"],"tense":["present"]}]},{"form":"rootest","grammar":[{"person":["second-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]},{"form":"rooteth","grammar":[{"person":["third-person"],"number":["singular"],"verbForm":["finite"],"tense":["present"],"mood":["indicative"]}],"labels":["obsolete"]}],"synonymSets":[{"sense":"cheer","synonyms":["barrack","cheer
	// on"]}]}],"license":{"name":"CC BY-SA
	// 3.0","url":"https://creativecommons.org/licenses/by-sa/3.0"},"sourceUrls":["https://en.wiktionary.org/wiki/root"]}]

	// "/data[Array][1]/likes[Object]/summary[Object]/total_count[String]"

}
