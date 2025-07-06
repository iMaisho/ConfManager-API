package fr.formation.confmanager.api;

import fr.formation.confmanager.dal.entities.Talk;
import fr.formation.confmanager.dal.repository.TalkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController combine @Controller et @ResponseBody.
// Il indique que cette classe gère des requêtes web et que les
// retours de méthodes seront directement écrits dans la réponse HTTP.
@RestController
// @RequestMapping définit l'URI de base pour toutes les méthodes
// de ce contrôleur.
@RequestMapping("/api/talks")
public class TalkController {

    private final TalkRepository talkRepository;

    // Injection de dépendance du repository pour accéder aux données.
    public TalkController(TalkRepository talkRepository) {
        this.talkRepository = talkRepository;
    }

    // @GetMapping indique que cette méthode répond aux requêtes HTTP GET.
    // L'URL complète sera donc : GET /api/talks
    @GetMapping
    public List<Talk> getAllTalks() {
        // Spring Data JPA nous offre findAll() pour récupérer tous les
        // enregistrements.
        return this.talkRepository.findAll();
    }
}